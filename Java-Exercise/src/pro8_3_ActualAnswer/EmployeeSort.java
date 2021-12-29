package pro8_3_ActualAnswer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {
	public static void main(String[] args) {
		new EmployeeSort();

	}
	public EmployeeSort() {   // constructor
		Employee[] empArray = {new Employee("George", 40000, 1996,11,5),  new Employee("Dave", 45000, 2003, 1, 3),
			                   new Employee("Richard", 50000, 2000, 2, 7)};
	
		List<Employee> empList = Arrays.asList(empArray); // putting array to List
		
		//Demo
		List<Employee> el = new ArrayList<>();
		for(int i = 0; i<empArray.length; i++) {
			el.add(empArray[i]);
		}
			System.out.println("With for loop: \n" + el);
		
		System.out.println("=============Using Name============");
		NameComparator nameComp = new NameComparator();
		Collections.sort(empList, nameComp);
		System.out.println(empList);
		
		System.out.println("============Using HireDate=================");
		HireDateComparator hireDateComp = new HireDateComparator();
		Collections.sort(empList, hireDateComp);
		System.out.println(empList);
		
		System.out.println("=============Using Salary==============");
		SalaryComparator salaryComp = new SalaryComparator();
		Collections.sort(empList, salaryComp);
		System.out.println(empList);
	}


}
