package interfaces;

// Pig "implements" the Animal interface
class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
	System.out.println("Line two of the same pig saying: wee wee!");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
    public static void main(String[] args) {
	    // Create a Pig object
	    Pig myPig = new Pig();
	    myPig.animalSound();
	    myPig.sleep();
    }
}
