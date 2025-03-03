public class Main {
    // Create a fullthottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
    // main method
    public static void main(String[] args) {
        // calling the fullThrottle method
        Main myCar = new Main();
        myCar.fullThrottle();
        myCar.speed(260);
    }
}