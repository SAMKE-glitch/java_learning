class Vehicle {
    protected String brand = "Ford"; // vehicle attribute
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang"; // car attribute
    public static void main(String[] args) {
        // create a myCar object
        Car myCar = new Car();

        // calling the honk method from Vehicle
        myCar.honk();

        // printing brand and madelName
        System.out.println("Brand: " + myCar.brand + " and model name is: " + myCar.modelName);
    }
}