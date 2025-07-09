package javahowtos;


public class ReverseString {
    public static String reverse(String input) {
        String reversed = "";
	for (int i = 0; i < input.length(); i++) {
	    reversed = input.charAt(i) + reversed;
	}
	return reversed;
    }

    public static void main(String[] args) {
        String original = "Hello";
	String result = reverse(original);

	System.out.println("Original string: " + original);
	System.out.println("Reversed string: "+ result);
    }
}
