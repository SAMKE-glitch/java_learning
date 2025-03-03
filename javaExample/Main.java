public class Main {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public methods
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    // main method
    public static void main(String[] args) {
        myStaticMethod(); // call the sttic method
        // myPublicMethod(); // This would compile an error
        Main myObj = new Main();
        myObj.myPublicMethod();
    }
}