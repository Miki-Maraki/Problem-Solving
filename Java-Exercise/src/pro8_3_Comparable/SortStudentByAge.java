package pro8_3_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentByAge {
	
	public static void main(String[] args) {
		 
		//Sorting Student Object Using Comparable Interface ....
		List<Student> sl = new ArrayList<Student>();  // array list of student
		
		Student stud1 = new Student("mk", 36);  // student 
		Student stud2 = new Student("abe", 35 );
		Student stud3 = new Student("Xavi", 34);
		Student stud4 = new Student("Dani", 42);
		Student stud5 = new Student("Bob", 31);
		
		// Student [] stu = { new Student("mk", 34), new Student("abe", 29), new Student("Xavi", 35), new Student("Dani", 36)};
		// List<Student> stlst = Arrays.asList(stu);
		// List<Employee> empList = Arrays.asList(empArray);
		sl.add(stud1);
		sl.add(stud2);
		sl.add(stud3);
		sl.add(stud4);
		sl.add(stud5);
		
		System.out.println("Before sort by age " + sl);
		Collections.sort(sl);
		System.out.println("After sort by age " + sl);

}
}