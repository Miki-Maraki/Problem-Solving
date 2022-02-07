package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
	
	public static void main(String args[]) {
		
		// Creating Array
		String[] array = { "Java", "Python", "PHP", "C++" };
		System.out.println("Printing Array: " + Arrays.toString(array)); // Array: [Java, Python, PHP, C++]
		
		// Converting Array to List
		List <String> list = new ArrayList <String> (); // option 1
		for (String lang : array) {
			list.add(lang);
		}
		System.out.println("Printing List: " + list);    // List: Java, Python, PHP, C++
		
		List <String> l = new ArrayList <String> ();   // option 2
		l.add("Java");
		l.add("Python");
		l.add("PHP");
		l.add("C++");
		System.out.println("the lists are : " + l);
	}
}
