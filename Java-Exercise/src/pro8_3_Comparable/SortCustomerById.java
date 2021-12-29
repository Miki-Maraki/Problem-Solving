package pro8_3_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCustomerById {
	
	public static void main(String[] args) {	

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
				
				System.out.println("Before Sorted by id : " + lc);
				
				Collections.sort(lc);
				System.out.println("After Sorted by id : " + lc);
  }
}
