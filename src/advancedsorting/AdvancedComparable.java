package advancedsorting;

import java.util.ArrayList;
import java.util.Collections;




public class AdvancedComparable {

    // Car class with natural ordering by year
    static class Car implements Comparable<Car> {
        String brand;
        String model;
        int year;


        public Car(String brand, String model, int year) {
            this.brand = brand;
	    this.model = model;
	    this.year = year;
        }

        // Natural ordering logic: sort by year
        @Override
        public int compareTo(Car other) {
            return Integer.compare(this.year, other.year);
        }

        @Override
        public String toString() {
            return brand + " " + model + " " + year;
        }
    }

    public static void main(String[] args) {
        ArrayList<Car> myCars = new ArrayList<>();
	myCars.add(new Car("BMW", "X5", 1999));
	myCars.add(new Car("Honda", "Accord", 2006));
	myCars.add(new Car("Ford", "Mustang", 1970));

	// Sorting using natural order (compareTo)
	Collections.sort(myCars);

	System.out.println("Sorted by year (natural order):");
	for (Car c : myCars) {
	    System.out.println(c);
	}

	// Reverse sort using lambda
	myCars.sort((a, b) -> b.compareTo(a));
	System.out.println("\nSorted by year (reverse):");
	for (Car c : myCars) {
	    System.out.println(c);
	}
    }
}
