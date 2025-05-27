package exceptionsTryCatch;

import java.util.Scanner;

public class DivisionCalculator {
	// Method that throws an exception if divisor is zero
	public static int divide(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("You cannot divide by zero");
		}
		return a / b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			// User input
			System.out.print("Enter the numerator: ");
			int numerator = scanner.nextInt();

			System.out.print("Enter the denominator: ");
			int denominator = scanner.nextInt();
			// Division operation
			int result = divide(numerator, denominator);
			System.out.println("Result: " + result);


		}
	}
}
