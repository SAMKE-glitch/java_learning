package javaIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterrator {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Lamborghini");
        cars.add("Nissan");
        cars.add("Pagani");
        cars.add("Range Rover");
        cars.add("Volkswagen");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        // Good to use the branch
        System.out.println(it.next());

    }
}
