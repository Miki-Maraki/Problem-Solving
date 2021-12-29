package pro8_3_Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStudentByName {
	
	public static void main(String[] args) {
		 
		//Sorting Student Object Using Comparable Interface ....
		List<Student> sl = new ArrayList<Student>();  // array list of student
		
		Student stud1 = new Student("mk", 34);  // student 
		Student stud2 = new Student("abe", 29);
		Student stud3 = new Student("Xavi", 35);
		Student stud4 = new Student("Dani", 36);
		Student stud5 = new Student("Bob", 35);
		
		// Student [] stu = { new Student("mk", 34), new Student("abe", 29), new Student("Xavi", 35), new Student("Dani", 36)};
		// List<Student> stlst = Arrays.asList(stu);
		// List<Employee> empList = Arrays.asList(empArray);
		sl.add(stud1);
		sl.add(stud2);
		sl.add(stud3);
		sl.add(stud4);
		sl.add(stud5);
		
		System.out.println("Before sort by name " + sl);
		Collections.sort(sl);
		System.out.println("After sort by name " + sl);
		
		// given arrays 
		int[] arr = {11,55,22,0,89};             // 
	    Arrays.sort(arr);
	    System.out.print("Sorted Int Array: ");     // [0, 11, 22, 55, 89]
	    System.out.println(Arrays.toString(arr));  // print

	}

}
