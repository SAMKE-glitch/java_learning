package javahowtos;


/**
 * A utility class that demonstrates how to find the smallest element in an integer array.
 */
public class MinElementFinder {
    /**
     * Returns the smallest value in the provided integer array.
     *
     * @param values the array of integers
     * @return the smalllest integer in the array
     */
    public static int findMinimum(int[] values) {
        int min = values[0]; // Assuming the first element is the smallest

	// Traverse the array to find the actual minimum
	for (int value: values) {
	    if (min > value) {
	        min = value;
	    }
	}
	return min;
    }
    /**
     * Main method to demonstrate finding the smallest value in an array.
     */
    public static void main(String[] args) {
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};

	int lowestAge = findMinimum(ages);

	System.out.println("The lowest age in the array is: " + lowestAge);
    }
}
