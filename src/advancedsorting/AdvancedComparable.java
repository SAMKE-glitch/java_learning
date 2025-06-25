package advancedsorting;

import java.util.ArrayList;
import java.util.Collections;




public class AdvancedComparable {

    // Car class with natural ordering by year
    public class Car implements Comparable<Car> {
        String brand;
        String model;
        int year;


        public Car(String brand, String model, int year) {
            this.brand = brand;
	    this model = model;
	    this.year = year;
        }

        // Natural ordering logic: sort by year
        @Override
        public int compareTo(Car other) {
            return Integer.compare(this.year, other.year);
        }

        @Override
        public String to String() {
            return brand + " " + model + " " + year;
        }
    }
}
