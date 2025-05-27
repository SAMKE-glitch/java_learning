package exceptionsTryCatch;

public class ExceptionExample {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30};

		try {
			// Thi line will throw ArrayIndexoutOfBoundsException
			int result = numbers[5] / 2;
			System.out.println("Result: " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Caught: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: " + e.getMessage());
		} finally {
			System.out.println("This block always executes.");
		}
		System.out.println("The program continues...");
	}
}
