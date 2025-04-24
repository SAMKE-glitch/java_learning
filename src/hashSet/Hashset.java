package hashSet;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();

        cars.add("Volvo");
        cars.add("Subaru");
        cars.add("Mazda");
        cars.add("Toyota");
        cars.add("Bugatti sport");
        cars.add("BMW");
        System.out.println(cars);

    }
}
