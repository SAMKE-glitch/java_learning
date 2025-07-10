package javahowtos;

public class ArraySumCalculator {
    public static int calculateSum(int[] array) {
        int sum = 0;

	// Iterate over the array and accumulate the sum
	for (int i = 0; i < array.length; i++) {
	    sum += array[i];
	}

	return sum;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 5, 10, 25};

	int result = calculateSum(myArray);

	System.out.println("The sum is: "+ result);
    }
}
