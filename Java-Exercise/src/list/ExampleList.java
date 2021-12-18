package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleList {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");		
		// Traversing list through Iterator		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
/*   public class TestJavaCollection2{  
           public static void main(String args[]){  
          
          LinkedList<String> al = new LinkedList<String>();  
             al.add("Ravi");  
			 al.add("Vijay");  
  			 al.add("Ravi");  
			 al.add("Ajay"); 
			  
		  Iterator<String> itr = al.iterator();  
  				while(itr.hasNext()){  
					System.out.println(itr.next());  
						}  
	     }  
}  

*/