package pro8_3_comparator;

import java.util.Comparator;
//A comparator interface is used to order the objects of user-defined classes. 
//A comparator object is capable of comparing two objects of the same class.
public class Student implements Comparator<Student>{
	private String name;
	private int age;
	private int rollNumber;
	public Student(String name, int age, int rollNumber){
		super();
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
	}
	// provide implemented method
	// sorting by using age
	public int compare(Student s1, Student s2) {
		if(s1.getAge() < s2.getAge()) { 
			return -1;
		}else if(s1.getAge() > s2.getAge()) {
		return 1;
	} else {
		return 0;      // give other options like compare by roll_no (return roll_no1 - roll_no2)
	}
  }
/*	
    // Method --->> Sorting in ascending order of roll number
    public int compare(Student a, Student b) {
        return a.getrollno - b.getrollno;
    }
    
    // Method --->> Sorting in ascending order of name
    public int compare(Student a, Student b){
        return a.name.compareTo(b.name);
    }
    
  */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge( int age) {
		this.age = age;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber( int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	// write toString method OR use Override toString method
	public String toString(){
		return "[name = " + name  + ", age = "  + age + ", roll number = "  + rollNumber + "]";
	}
}
