package javahowtos;

import java.util.HashMap;

/**
 * A utility class that demonstrates various ways to loop through a HashMap.
 */
public class HashMapLooper {
    /**
     * Prints all the keys in the HashMap.
     * @param map the HashMap containing key-value pairs.
     */
    public static void printKeys(HashMap<String, String> map) {
        System.out.println("Keys:");
	for (String key: map.keySet()) {
	    System.out.println(key);
	}
    }

    /**
     * Prints all the values in the HashMap.
     * @param map the HashMap containing key-value pairs
     */
    public static void printValues(HashMap<String, String> map){
        System.out.println("values:");
	for (String value: map.values()) {
	    System.out.println(value);
	}
    }

    /**
     * Prints all keys and their corresponding values.
     * @param map the HashMap containing key-value pairs
     */
    public static void printKeyValuePairs(HashMap<String, String> map) {
        System.out.println("Key-Value Pairs:");
	for (String key: map.keySet()) {
	    System.out.println("key: "+key + " value: "+ map.get(key));
	}
    }

    /**
     * Main method to demonstrate looping through a HashMap.
     */
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

	capitalCities.put("Kenya", "Nairobi");
	capitalCities.put("Tanzania", "Dodoma");
	capitalCities.put("Uganda", "Kampala");
	capitalCities.put("Ethiopia", "Addis Ababa");
	

	printKeys(capitalCities);
	System.out.println();

	printValues(capitalCities);
	System.out.println();

	printKeyValuePairs(capitalCities);
    }
}
