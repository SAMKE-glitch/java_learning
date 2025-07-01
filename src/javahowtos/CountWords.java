package javahowtos;


public class CountWords {
    public static void main(String[] args) {
        String words = "One Two Three Four";

	// Splitthe string by whitespace and count the resulting parts
	int countWords = words.split("\\s+").length;

	System.out.println("Input: " + words);
	System.out.println("Word Count: "+ countWords);
    }
}
