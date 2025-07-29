package javahowtos;


import java.util.Random;
import java.util.Scanner;

/**
 * This class demonstrates how to generate random numbers in Java
 * using both Math.random() and the Random class.
 */
public class RandomNumberGenerator {
    /**
     * Generates a random integer between min and max (inclusive) using
     * Math.random().
     */
    public static int generateWithMathRandom(int min, int max) {
        return (int)(Math.random() * (max - min +1 )) + min;
    }

    /**
     * Genrates a random integer between min and max (inclusive) using java.util.Random.
     */
    public static int generateWithRandomClass(int min, int max) {
        Random rand = new Random():
	return rand.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        Scanner scanner = Scanner(System.in);

	System.out.print("Enter minimum value: ");
	int min = scanner.nextInt();

	System.out.print("Enter maximum value: ");
	int max = scanner.nextInt();
	
	int mathRandomValue = generateWithMathRandom(min, max);
	int randomClassValue = generateWithRandomClass(min, max);

	System.out.printf("Random number using Math.random(): %d%n", mathRandomValue);
	System.out.printf("Random number using Random class: %d%n", randomClassValue);

	scanner.close();



    }
}
