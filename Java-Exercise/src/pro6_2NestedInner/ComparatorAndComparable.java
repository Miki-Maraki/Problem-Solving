package pro6_2NestedInner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparable {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Jojo");
		l.add("Tina");
		l.add("Halu");
		l.add("Abe");
		System.out.println("Before Sorted " + l);
		Collections.sort(l);
		System.out.println("After Sorted " + l);
		
		//Sorting Customer Object Using Comparable Interface
		List<Customer> lc = new ArrayList<>();

		Customer c1 = new Customer(100, "Nigus", 5000);
		Customer c2 = new Customer(101, "JJ", 4000);
		//Customer c6 = new Customer(106, "JJ", 4000);
		Customer c3 = new Customer(102, "Mike", 6000);
		Customer c4 = new Customer(103, "Abe", 4000);

		lc.add(c1);
		lc.add(c2);
		lc.add(c3);
		lc.add(c4);
		//lc.add(c6);

		System.out.println("Before Sorted by Name : " + lc);
		Collections.sort(lc);
		System.out.println("After Sorted by Name : " + lc);

		
		
		
		
		///Sorting CustomerOne Object Using Comarator Interface
		List<CustomerOne> lco = new ArrayList<>();

		CustomerOne co1 = new CustomerOne(100, "Nigus", 5000);
		CustomerOne co2 = new CustomerOne(101, "JJ", 4000);
		//Customer co6 = new Customer(106, "JJ", 4000);
		CustomerOne co3 = new CustomerOne(102, "Mike", 6000);
		CustomerOne co4 = new CustomerOne(103, "Abe", 4000);

		lco.add(co1);
		lco.add(co2);
		lco.add(co3);
		lco.add(co4);
		//lc.add(co6);


		SortBySalaryAndIdComparator ss = new SortBySalaryAndIdComparator();
		
		System.out.println("Before Sorted By Salary : "+lc);
		
		Collections.sort(lco, ss);
//		                OR
//		Collections.sort(lco, new Comparator<CustomerOne>() {
//
//			@Override
//			public int compare(CustomerOne o1, CustomerOne o2) {
//				if (o1.getSalary() < o2.getSalary()) {
//					return -1;
//				} else if (o1.getSalary() > o2.getSalary()) {
//					return 1;
//				} else if (o1.getSalary() == o2.getSalary()) {
//					return o1.getId() - o2.getId();
//				}
//				return 0;
//			}
//			
//		});
		System.out.println("After Sorted By Salary : "+lc);


	}

}
