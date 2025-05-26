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
	}
}
