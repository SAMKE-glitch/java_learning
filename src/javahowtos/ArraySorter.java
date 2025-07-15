package javahowtos;

import java.util.Arrays;


public class ArraySorter {
    public static void sortAndPrint(String[] array) {
	// Sorts alphabetically
        Arrays.sort(array);
	for (String item: array) {
	    System.out.println(item);
	}
    }

    public static void main(String[] args) {
        String[] Car = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};

	System.out.println("Before sorting:");
	for (String car : cars) {
	    System.out.println(car)
	}

	System.out.println("\n After sorting:");
	sortAndPrint(cars);
    }
}
