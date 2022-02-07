package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//To remove dupliates from ArrayList, we can convert it into Set. Since Set 
//doesn't contain duplicate elements, it will have only unique elements.

public class RemoveDuplicateArrayList {
	
	 public static void main(String[] args) {  
	        List<String> l = new ArrayList<String>();  
	        l.add("Mango");  
	        l.add("Banana");  
	        l.add("Mango");
	        l.add("Pomegranate");
	        l.add("Apple");
	        l.add("Pineapple");
	        System.out.println(l.toString()); // print array list
	        
	        // change ArrayList to Set
	        Set<String> s = new LinkedHashSet<String>(l); // option 1
	        System.out.println("set is " + s);  
	        
	        // using for each loop
	        Set<String> set = new HashSet<String>();      // option 2
	        for(String str:l) {
	        	set.add(str); 
	        }
	        System.out.println("set through for each loop " + set);
	    }  

}
