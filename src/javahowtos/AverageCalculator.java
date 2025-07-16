package javahowtos;


public class AverageCalculator {
    public static float calculateAvaerage(int[] values) {
        float sum = 0;
	// Aggregate the sum of all elements
	for (int value : values) {
	    sum += value;
	}
	// Calculate and return the avrage
	return sum / values.length;
    }

    public static void main(String[] args) {
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};

	float average = calculateAvaerage(ages);

	System.out.println("\nThe avrage age is: " + average);
    }
}
