package advancedsorting;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator


public class AdvancedSorting {
    // static nested Car class
    static class Car {
        String brand;
	String model;
	int year;
    
        public Car(String brand, String model, int year) {
            this.brand = brand;
	    this.model = model;
	    this.year = year;
        }

	@Override
	public String toString() {
	    return brand + " " + model + " " + year;
	}
    }


    // Static nested Comparator class to sort by year
    static class SortByYear implememnts Comparator<Car> {
        @Override
	public int compare(Car a, Car b) {
	    return Integer.compare(a.year, b.year)
	}
    }

    public static void main(String[] args) {
        // Create a list of cars
	ArrayList<Car> myCars = new ArrayList<>();
	myCars.add(new Car("BMW", "X5", 1999));
	myCars.add(new Car("Honda", "Accord", 2006));
	myCars.add(new Car("Ford", "Mustang", 1970));

	// Sort using a comparator class
	Collections.sort(myCars, new SortByYear());

	// Display sorted list
	System.out.println("Sorted by year:");
	for (Car c : myCars) {
	    System.out.println(c);
	}

	// Optional: Sort using lambda express
	Collections.sort(myCars, (a, b) -> a.brand.compareTo(b.brand));
	System.out.println("\nSorted by brand:");
	for (Car c : myCar) {
	    System.out.println(c);
	}
	
    }
}
