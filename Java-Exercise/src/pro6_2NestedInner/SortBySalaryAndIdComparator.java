package pro6_2NestedInner;

import java.util.Comparator;

public class SortBySalaryAndIdComparator implements Comparator<CustomerOne> {

	@Override
	public int compare(CustomerOne o1, CustomerOne o2) {
		// TODO Auto-generated method stub

		if (o1.getSalary() < o2.getSalary()) {
			return -1;
		} else if (o1.getSalary() > o2.getSalary()) {
			return 1;
		} else if (o1.getSalary() == o2.getSalary()) {
			return o1.getId() - o2.getId();
		}
		return 0;

	}

//	@Override
//	public int compare(Customer o1, Customer o2) {
//		// TODO Auto-generated method stub
//		if (o1.getSalary() == o2.getSalary()) {
//			return 0;
//		} else if (o1.getSalary() < o2.getSalary()) {
//			return -1;
//		}
//		return 1;
//	}

}
