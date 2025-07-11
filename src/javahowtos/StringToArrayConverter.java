package javahowtos;


public class StringToArrayConverter {
    public static void convertAndPrint(String input) {
        // Convert the string to a char array
	char[] charArray = input.toCharArray();

	// Print each character in the array
	for (char c : charArray) {
	    System.out.println(c);
	}
    }

    public static void main(String[] args) {
        String myStr = "Hello";

	// Demonstration: Access a specific element
	char[] myArray = myStr.toCharArray();
	System.out.println("First character: " + myArray[0]);

	// Demonstration: Print all characters
	System.out.println("All characters in the string:");
	convertAndPrint(myStr);
    }
}
