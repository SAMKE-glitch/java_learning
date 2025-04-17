1. Client (Presentation Layer)
   HTTP POST to /users

Endpoint: https://api.example.com/users

Payload (JSON):

json
Copy
Edit
{
"username": "samke",
"email": "samke@example.com"
}
2. Controller (@RestController)
   java
   Copy
   Edit
   @RestController
   @RequestMapping("/users")
   public class UserController {

   private final UserService userService;

   public UserController(UserService svc) {
   this.userService = svc;
   }

   @PostMapping
   public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO requestDto) {
   User user = userService.createUser(requestDto);
   UserResponseDTO responseDto = mapToResponseDto(user);
   return ResponseEntity
   .status(HttpStatus.CREATED)
   .body(responseDto);
   }
   }
   Key Responsibilities

Deserializes JSON into UserRequestDTO

Delegates to Service Layer

Maps domain object back to UserResponseDTO for the API response

Returns HTTP 201 CREATED on success

3. DTOs (Boundary Objects)
   java
   Copy
   Edit
   // Incoming boundary
   public class UserRequestDTO {
   @NotBlank private String username;
   @Email    private String email;
   // getters/setters
   }

// Outgoing boundary
public class UserResponseDTO {
private Long   id;
private String username;
private String email;
// getters/setters
}
Key Responsibilities

Structure request/response payloads

Enforce validation via JSR‑380 annotations (@NotBlank, @Email)

Decouple API contract from domain model

4. Service Layer (@Service)
   java
   Copy
   Edit
   @Service
   public class UserService {

   private final UserRepository userRepo;
   private final ModelMapper    mapper;

   public UserService(UserRepository repo, ModelMapper mapper) {
   this.userRepo = repo;
   this.mapper   = mapper;
   }

   @Transactional
   public User createUser(UserRequestDTO dto) {
   // 1. Map DTO → Entity
   User entity = mapper.map(dto, User.class);

        // 2. Apply any business rules, e.g., check for duplicate username
        if (userRepo.existsByUsername(entity.getUsername())) {
            throw new DuplicateResourceException("Username already in use");
        }

        // 3. Persist entity
        return userRepo.save(entity);
   }
   }
   Key Responsibilities

Transactional boundary

Maps DTO → Domain Entity (using ModelMapper, MapStruct, etc.)

Executes business logic (e.g., uniqueness checks)

Calls Repository to persist

5. Repository (JpaRepository)
   java
   Copy
   Edit
   @Repository
   public interface UserRepository extends JpaRepository<User, Long> {
   boolean existsByUsername(String username);
   }
   Key Responsibilities

Abstracts CRUD operations

Leverages Spring Data JPA under the hood

Executes SQL against the database

6. Database (Persistence Layer)
   Action: INSERT INTO users (username, email) VALUES (?, ?)

Outcome:

New record with generated id

Transaction is committed

7. Response Cycle
   Repository.save() returns the managed User entity (now carrying id).

Service returns this entity to the Controller.

Controller maps it to UserResponseDTO and issues:

http
Copy
Edit
HTTP/1.1 201 Created
Content-Type: application/json

{
"id": 42,
"username": "samke",
"email": "samke@example.com"
}
Client receives confirmation with the newly created user’s details.

Sequence Diagram (Simplified)
text
Copy
Edit
````
Client -> UserController : POST /users {username, email}
UserController -> UserService   : createUser(requestDto)
UserService   -> UserRepository : existsByUsername(username)?
UserService   -> UserRepository : save(UserEntity)
UserRepository -> Database      : INSERT...
Database      -> UserRepository : generated ID
UserRepository -> UserService   : UserEntity(id, …)
UserService   -> UserController  : UserEntity
````
In GraphQL
``
Client -> GraphQL Engine : mutation createUser(input)
GraphQL   -> UserMutation  : createUser(input)
UserMutation -> UserService : createUser(dto)
UserService -> UserRepository : existsByUsername?
UserService -> UserRepository : save(entity)
UserRepository -> DB         : INSERT...
DB         -> UserRepository : new record ID
UserRepository -> UserService : entity
UserService   -> UserMutation : entity
UserMutation  -> GraphQL      : UserPayload
GraphQL       -> Client       : { data: { createUser: … } }
``
In summary, the DTOs act as the contract boundaries, the Controller handles HTTP concerns, the Service encapsulates business logic and mapping, the Repository orchestrates persistence, and the Database ultimately stores the record. This layered approach promotes separation of concerns, testability, and maintainability.