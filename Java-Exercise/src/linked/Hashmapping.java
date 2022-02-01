package linked;

import java.util.HashMap;

public class Hashmapping {
	
	public static void main(String[] args) {
	    // Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    System.out.println(capitalCities.get("England"));
	    System.out.println(capitalCities.get("USA"));
	    
	    System.out.println(capitalCities.size()); //4
	    
	   // Note: Use the keySet() method if you only want the keys, and use
	   //       the values() method if you only want the values:
	    for (String i : capitalCities.keySet()) { // when want the keys only
	        System.out.println(i);
	      }
	    for (String i : capitalCities.values()) { // when want the values only
	        System.out.println(i);
	      }
	    for (String i : capitalCities.keySet()) {  // when to print key with values
	        System.out.println("key: " + i + " value: " + capitalCities.get(i));
	      }
	  }

}
