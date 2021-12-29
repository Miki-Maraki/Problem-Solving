package pro8_3_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCustomerByName {
	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		l.add("Jojo");
		l.add("Tina");
		l.add("Halu");
		l.add("Abe");
// if our object data type are String + 8 primitive, we can sort with out using Comparable Interface and Comparator Interface
		System.out.println("Before Sorted " + l); //   [Jojo, Tina, Halu, Abe]
		Collections.sort(l);
		System.out.println("After Sorted " + l); //    [Abe, Halu, Jojo, Tina]
		
		
		//Sorting Customer Object Using Comparable Interface ....
		List<Customer> lc = new ArrayList<Customer>();    // here our object data type is Customer... it need to be Comparable

		Customer c1 = new Customer(104, "Nigus", 5000);
		Customer c2 = new Customer(101, "JJ", 4000);
		Customer c3 = new Customer(105, "Mike", 6000);
		Customer c4 = new Customer(100, "Abe", 4000);
		Customer c5 = new Customer(103, "Xavi", 4500);
		Customer c6 = new Customer(102, "Hawe", 5500);
		lc.add(c1); 
		lc.add(c2);   // adding customer data to list
		lc.add(c3);
		lc.add(c4);
		lc.add(c5);
		lc.add(c6);
/*       
		Customer[] cl = {new Customer(100, "Nigus", 5000), // customer array list
				        new Customer(102, "Mike", 6000), 
				        new Customer(102, "Mike", 6000), 
				        new Customer(103, "Abe", 4000) };
*/		
		// now it needs sort by using Comparable 
		System.out.println("Before Sorted by Name : " + lc);
		
/*	    public int compareTo(Customer o) {        //by calling the implemented method
		 return this.name.compareTo(o.name);
		 }                                      ------>>> sort by name only, not work others
 */	 
		Collections.sort(lc);
		System.out.println("After Sorted by Name : " + lc);

	}
}
