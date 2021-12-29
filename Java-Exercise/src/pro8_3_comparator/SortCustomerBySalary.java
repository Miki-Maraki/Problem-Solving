package pro8_3_comparator;

import java.util.Comparator;

public class SortCustomerBySalary implements Comparator<Customer> {

/*	1. Comparator Interface in Java with a method
    public interface Comparator<Object> { // interface
    1.1 public int compare(Object o1, Object o2);  // gives more option for sorting lists
    if o1 < o2 return -1, o1 > o2 return 1, o1 = o2 return 0
     }
    1.2 boolean equals(Object o)
*/
	public int compare(Customer o1, Customer o2) {

		if (o1.getSalary() < o2.getSalary()) {
			return -1;
		} else if (o1.getSalary() > o2.getSalary()) {
			return 1;
		} else if (o1.getSalary() == o2.getSalary()) {
			return o1.getId() - o2.getId();
		}
		return 0;

	}

}
