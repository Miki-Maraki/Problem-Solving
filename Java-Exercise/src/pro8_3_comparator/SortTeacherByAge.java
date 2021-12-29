package pro8_3_comparator;

import java.util.Comparator;

public class SortTeacherByAge implements Comparator<Teacher> {

	public int compare(Teacher t1, Teacher t2) {
		if (t1.getAge() != t2.getAge()) {
			if (t1.getAge() > t2.getAge()) {
				return 1;
			} else {
				return -1;
			}
		}
		// age1 equals age2, then sort by name
		if (t1.getName().compareTo(t2.getName()) != 0) {
			return t1.getName().compareTo(t2.getName());
		}
		// age1 equals age2 and name1 equals name2, then sort by id
		if (t1.getId() != t2.getId()) {
			if (t1.getId() < t2.getId()) {
				return -1;
			} else {
				return 1;
			}
		}
		// age1 equals age2, name1 equals name2 and id1 equals id2, then sort by salary
		if (t1.getSalary() != t2.getSalary()) {
			if (t1.getSalary() < t2.getSalary()) {
				return -1;
			} else {
				return 1;
			}
		}
		return 0;
	}

}
