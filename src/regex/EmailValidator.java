package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidator {
	public static void main(String[] args) {
		// Define the regex pattern for a simple email validation
		String emailPattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(com|org|net)";
		
		// Compile the pattern
		Pattern pattern = Pattern.compile(emailPattern);

		// Test email addresses
		String[] emails = {
			"test@example.com",
			"invalid-email@com",
			"user.name@domain.net",
			"name@domain@org",
			"user@domian@com"
		};

		// Check each email to see if it matches the pattern
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println("Checking: " + email);

			if (matcher.matches()) {
				System.out.println("Valid email address!");
			} else {
				System.out.println("Invalid email address!");
			}
			System.out.println(); 
		}
	}
}
