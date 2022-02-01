package linked;

import java.util.HashSet;

public class HashSetMethods {
	
	public static void main(String[] args) {
	    HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	    for (String i : cars) {
	        System.out.println(i);
	      }
	    System.out.println(cars.size());
	    cars.remove("Volvo");
	    System.out.println(cars);
	    System.out.println(cars.contains("Mazda"));// true
	    cars.clear();
	    System.out.println(cars);
	  }

}
