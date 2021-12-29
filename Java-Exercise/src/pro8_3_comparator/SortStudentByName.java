package pro8_3_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudentByName implements Comparator<Student>{
	
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
	
	public static void main(String [] args) {
		 List<Student> lst = new ArrayList<Student>();
		
		//Student st = new Student();
		Student stud1 = new Student("John", 37, 303);
		Student stud2 = new Student("abe", 36, 307);
		Student stud3 = new Student("Xavi", 35, 301);
		Student stud4 = new Student("Dani", 29, 304);
		Student stud5 = new Student("Bob", 35, 306);
		
		//Student [] st = { new Student("mk", 34), new Student("abe", 29), new Student("Xavi", 35), new Student("Dani", 36)};
		lst.add(stud1);
		lst.add(stud2);
		lst.add(stud3);
		lst.add(stud4);
		lst.add(stud5);
		
		System.out.println("Before sort by roll number " + lst);
		SortStudentByName sn = new SortStudentByName(); // create object
		
		Collections.sort(lst, sn);
		System.out.println("After sort by roll number " + lst);
	
	 }

}
