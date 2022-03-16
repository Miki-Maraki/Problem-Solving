package pro8_3_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

        
public class CustTest {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>(); // String ....use regular sort
		l.add("Jojo");
		l.add("Tina");
		l.add("Halu");
		l.add("Abe");
		System.out.println("Before Sorted " + l);
		Collections.sort(l);
		System.out.println("After Sorted " + l);	
		
		///Sorting Customer Object Using Comparator Interface
		List<Customer> lc = new ArrayList<Customer>();

		Customer c1 = new Customer(100, "Nigus", 5000);
		Customer c2 = new Customer(101, "JJ", 4000);
		Customer c5 = new Customer(105, "Xavi", 4500);
		Customer c3 = new Customer(102, "Mike", 6000);
		Customer c4 = new Customer(103, "Abe", 4000);

		lc.add(c1);
		lc.add(c2);
		lc.add(c3);
		lc.add(c4);
		lc.add(c5);

		SortCustomerBySalary ss = new SortCustomerBySalary();   // create object 
        System.out.println("Before Sorted By Salary : " + lc);
		
		Collections.sort(lc, ss);
		               // OR
		//Collections.sort(lc, new Comparator<CustomerOne>() {	
		System.out.println("After Sorted By Salary : " + lc);
	}
}
