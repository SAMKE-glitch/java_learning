package javahowtos;

// Define an enumeration
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class LoopThroughEnum {
    public static void main(String[] args) {
        System.out.println("Enumerated Levels:");
	for (Level level : Level.values()) {
	    System.out.println(level);
	}
    }
}
