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
	}
}
