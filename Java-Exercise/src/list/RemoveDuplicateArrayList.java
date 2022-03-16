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
	        List<String> list = new ArrayList<String>();  
	        list.add("Mango");  
	        list.add("Banana");  
	        list.add("Mango");
	        list.add("Pomegranate");
	        list.add("Apple");
	        list.add("Pineapple");
	        System.out.println(list.toString()); // print array list
	        
	        // change ArrayList to Set
	        Set<String> s = new LinkedHashSet<String>(list); // option 1
	        System.out.println("Set is " + s);  
	        
	        // using for each loop
	        Set<String> set = new HashSet<String>();      // option 2
	        for(String str:list) {
	        	set.add(str); 
	        }
	        System.out.println("Set through for each loop " + set);
	    }  

}
