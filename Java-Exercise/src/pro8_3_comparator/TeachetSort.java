package pro8_3_comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TeachetSort {
	
	public static void main(String [] args) {
		
		Teacher [] t = {new Teacher (199, "Dani", 27, 4600), new Teacher (206, "Hani", 23, 4670), new Teacher (201, "King", 30, 5600), 
				new Teacher (204, "Dani", 34, 4200), new Teacher (202, "Xavi", 24, 6600), new Teacher (209, "Abe", 27, 4690),
				new Teacher (301, "Mike", 35, 5300), new Teacher (200, "George", 19, 6100), new Teacher (202, "Bob", 30, 6800),
				new Teacher (206, "Ase", 24, 4600), new Teacher (199, "Sami", 29, 4400), new Teacher (204, "Lake", 25, 4690),
				new Teacher (200, "Hani", 35, 6600), new Teacher (301, "Sami", 25, 4200), new Teacher (201, "Ase", 34, 5300)};
		
		List<Teacher> tchrList = Arrays.asList(t); // change teacher Array  to teacher List
		System.out.println("Before sort : " + tchrList);
		
		System.out.println("====Sort by Age =======");
		SortTeacherByAge sa = new SortTeacherByAge();      // create object
		Collections.sort(tchrList, sa);
		System.out.println(tchrList );
		
		System.out.println("====Sort by Name =======");
		SortTeacherByName sn = new SortTeacherByName();     // create object
		Collections.sort(tchrList, sn);
		System.out.println(tchrList);
		
		System.out.println("====Sort by Id =======");
		SortTeacherById si = new SortTeacherById();      // create object
		Collections.sort(tchrList, si);
		System.out.println(tchrList);
		
		System.out.println("====Sort by salary =======");
		SortTeacherBySalary ss = new SortTeacherBySalary();   // create object
		Collections.sort(tchrList, ss);
		System.out.println(tchrList);

    }
}
