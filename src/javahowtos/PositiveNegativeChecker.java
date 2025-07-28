package javahowtos;


import java.util.Scanner;

public class PositiveNegativeChecker {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number: ");
        int myNum = scanner.nextInt();

	if (myNum > 0) {
	    System.out.println("The value is a positive number.");
	} else if (myNum < 0) {
	    System.out.println("The value is a negative number.");
	} else {
	    System.out.println("The value is 0.");
	}
    }
}
