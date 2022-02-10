package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	
	public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Bbbbb");
	    Collections.sort(cars);  // Sort cars
	    for (String i : cars) {
	      System.out.println(i);
	    }

    }
}
