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


    // 
}
