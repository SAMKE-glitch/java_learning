package javahowtos;

import java.util.Scanner;


public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = Scanner(System.in);

	System.out.println("Enter a number: ");
	double number = scanner.nextDouble();

	if (number < 0 ) {
	    System.out.println("Error: Cannot compute square root of a negative number.")'
	} else {
	    double result = Math.sqrt(number);
	    System.out.println("The square root of " + number + " is " + result);
	}

	Scanner.close();
    }
}
