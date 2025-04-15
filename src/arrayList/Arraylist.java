package arrayList;

import java.util.ArrayList; // import the ArrayList class

public class Arraylist {
    ArrayList<String> cars = new ArrayList<String>(); //Create an ArrayList object

    public void addCars(){
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Subaru");
        cars.add("Pigeot");
    }

    public void displayCars(){
        for (String car : cars){
            System.out.println(car);
        }
    }

    // entry point
    public static void main(String[] args) {
        Arraylist myCars = new Arraylist();
        myCars.addCars();
        myCars.displayCars();
    }
}
