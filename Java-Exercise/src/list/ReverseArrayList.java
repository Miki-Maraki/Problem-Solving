package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
	
	 public static void main(String[] args) {  
	        List<String> ls = new ArrayList<String>();  
	        ls.add("Mango");  
	        ls.add("Banana");  
	        ls.add("Mango");  
	        ls.add("Apple");  
	        System.out.println("Before Reversing");  
	        System.out.println(ls.toString()); 
	        
	        Collections.reverse(ls);         
	        System.out.println("After Reversing");  
	        System.out.println(ls.toString());  
	        
	        
	    }  

}
