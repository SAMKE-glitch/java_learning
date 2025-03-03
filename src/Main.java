// Code from filename: Main.java
// abstract class
abstract class Main {
    private String lname = "Mwakughu";
    public String fname = "John";
    public int age = 24;

    // TODO Getter for lname
    public String getLname(){
        return lname;
    }
    // TOD Setter for lname
    public void setLname(String lastName) {
        this.lname = lastName;
    }
    public abstract void study(); //abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
    public int graduationYear = 2018;


    @Override
    public void study() {
        // The body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}