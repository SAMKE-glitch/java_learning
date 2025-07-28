package javahowtos;

import java.util.Scanner;


public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	System.out.println("Enter a number: ");
	double number = scanner.nextDouble();

	if (number < 0 ) {
	    System.out.println("Error: Cannot compute square root of a negative number.");
	} else {
	    double result = Math.sqrt(number);
	    System.out.printf("The square root of %.2f is %.2f\n", number, result);
	}

	scanner.close();
    }
}
