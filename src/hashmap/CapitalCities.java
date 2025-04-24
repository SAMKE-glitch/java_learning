package hashmap;

import java.net.SocketOption;
import java.util.HashMap;

public class CapitalCities {
    public static void main(String[] args) {
        // Creating a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add key and values to the object capitalCities
        capitalCities.put("England", "London");
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Tanzania", "Dar es Salaam");
        capitalCities.put("Nigeria", "Abuja");
        capitalCities.put("Uganda", "Kampala");
        capitalCities.put("United States", "Washington DC");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("German", "Berlin");

        // Printing key and values on the HashMap object
        for(String i : capitalCities.keySet()){
            System.out.println("Key: " + i + ","+ " Value: " + capitalCities.get(i));
        }

        capitalCities.remove("Kenya");


        System.out.println(capitalCities);
        System.out.println(capitalCities.size());

    }
}
