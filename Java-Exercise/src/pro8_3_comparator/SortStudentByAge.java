package pro8_3_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudentByAge implements Comparator<Student> {

	// provide implemented method
	// sorting by using age
	public int compare(Student s1, Student s2) {
		return s1.getAge() - s2.getAge();
	}
/*  OR  if (s1.getAge() < s2.getAge()) {
			return -1;
		} else if (s1.getAge() > s2.getAge()) {
			return 1;
		} else if(s1.getAge() == s2.getAge()) {
			return s1.getRollNumber() - s2.getRollNumber(); // give other options like compare by roll_no (return roll_no1 - roll_no2)
		}
		return 0;
	}
*/
	public static void main(String[] args) {
		List<Student> lst = new ArrayList<Student>();

		// Student st = new Student(); 
		Student stud1 = new Student("John", 37, 303);
		Student stud2 = new Student("abe", 36, 307);
		Student stud3 = new Student("Xavi", 35, 301);
		Student stud4 = new Student("Dani", 29, 304);
		Student stud5 = new Student("Bob", 35, 306);

		Student [] stud = { new Student("mk", 34, 304), new Student("abe", 29, 301), new Student("Xavi", 35, 306), new Student("Dani", 36, 307)};
				List<Student> lssst = new ArrayList<>();
				for(int i = 0; i < stud.length; i++) {
					lssst.add(stud[i]);
				}
		System.out.println("list of stud : "+ lssst);
		lst.add(stud1); // OR by adding individual 
		lst.add(stud2);
		lst.add(stud3);
		lst.add(stud4);
		lst.add(stud5);

		System.out.println("Before sort by age " + lst);
		SortStudentByAge sa = new SortStudentByAge();    // create of object
		
		Collections.sort(lst, sa);
		System.out.println("After sort by age " + lst);

	}

}
