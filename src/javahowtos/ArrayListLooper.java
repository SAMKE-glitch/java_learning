package javahowtos;


import java.util.ArrayList;


/**
 * A utility class that demonstrates how to loop through an ArrayList in Java.
 */
public class ArrayListLooper {
    /**
     * Prints all elements of the given ArrayList.
     * @param list the ArrayList to iterate through
     */
    public static void printList(ArrayList<String> list) {
        for (String item : list) {
	    System.out.println(item);
	}
    }

    /**
     * Main method to demonstrate iterating over an ArrayList.
     */
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
	cars.add("Volvo");
	cars.add("BMW");
	cars.add("Ford");
	cars.add("Mazda");

	System.out.println("Cars in the list:");
	printList(cars);
    }
}
