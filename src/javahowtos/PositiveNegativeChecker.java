package javahowtos;


public class PositiveNegativeChecker {
    public static void main(String[] args) {
	// Check if this number is positive, negative or zero
        int myNum = 10;

	if (myNum > 0) {
	    System.out.println("The value is a positive number.");
	} else if (myNum < 0) {
	    System.out.println("The value is a negative number.");
	} else {
	    System.out.println("The value is 0.");
	}
    }
}
