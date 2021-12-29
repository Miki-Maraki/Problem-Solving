package pro8_3_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import pro8_3_ActualAnswer.Employee;

public class SortStudentByRollNumber implements Comparator<Student>{
	
	// Method --->> Sorting in ascending order of roll number
    public int compare(Student a, Student b) {
        return a.getRollNumber() - b.getRollNumber();
    }
	
	public static void main(String [] args) {
		 List<Student> lst = new ArrayList<Student>();
		
		//Student st = new Student();
		Student stud1 = new Student("John", 37, 303);
		Student stud2 = new Student("abe", 36, 307);
		Student stud3 = new Student("Xavi", 35, 301);
		Student stud4 = new Student("Dani", 29, 304);
		Student stud5 = new Student("Bob", 35, 306);
		
		//Student [] stud = { new Student("mk", 34), new Student("abe", 29), new Student("Xavi", 35), new Student("Dani", 36)};
/*				List<Student> lst = new ArrayList<>();
				for(int i = 0; i<stud.length; i++) {
					lst.add(stud[i]);
				}
*/				
		lst.add(stud1); // OR by adding individual 
		lst.add(stud2);
		lst.add(stud3);
		lst.add(stud4);
		lst.add(stud5);
		
		System.out.println("Before sort by roll number " + lst);
		SortStudentByRollNumber srn = new SortStudentByRollNumber(); // create object
		
		Collections.sort(lst, srn);
		System.out.println("After sort by roll number " + lst);
	
	 }
}
