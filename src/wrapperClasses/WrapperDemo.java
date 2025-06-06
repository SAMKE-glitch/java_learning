package wrapperClasses;


import java.util.ArrayList;


public class WrapperDemo {
	public static void main(String[] args) {
		// Autoboxing: primitive to wrapper
		int primitiveInt = 42;
		Integer wrappedInt = primitiveInt;
		System.out.println("Autoboxed Integr: " + wrappedInt);

		// Unboxing: wrapper to primitive
		Double wrappedDouble = 3.1415;
		double primitiveDouble = wrappedDouble;
		System.out.println("Nuboxed double: " + primitiveDouble);

		// Using wrapper methods
		String numberStr = "123";
		int parsedInt = Integer.parseInt(numberStr);
		System.out.println("Parsed int from string: " + parsedInt);

		// Wrapper in collection
		ArrayList<Boolean> flags = new ArrayList<>();
		// autoboxed to Boolean
		flags.add(true);
		flags.add(false);
		flags.add(Boolean.valueOf("true"));

		System.out.println("Boolean values in ArrayList:");
		for(Boolean flag: flags) {
			System.out.println(flag);
		}

		// Comparing wrapper objects
		Integer a = 100;
		Integer b = 100;
		Integer c = 100;
		Integer d = 100;

		System.out.println("a == b: " + (a == b));
		System.out.println("c == d: " + (c == d));
		System.out.println("c.equals(d): " + c.equals(d));

		// converting Wrapper to String
		Integer number = 123;
		String numString = number.toString();
		System.out.println("number in string: " + numString);
	}
}
