package pro8_3_Comparable;

// Comparable is important to sort only by one field
public class Student implements Comparable<Student> {  // T represent student
	private String name;
	private int age;
	
	public Student(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}

/*	
	// provide implemented method... sort by name
	public int compareTo(Student s) {          // (className objectName)
		return this.name.compareTo(s.name);     // (objectName.fieldName)
	}
*/	
	// sort by using age
/*	public int compareTo(Student s) {
		if(this.age > s.age) {
			return 1;
		}else if (this.age < s.age) {
			return -1;
		}
		return 0;
	}
*/	
	// OR sort by using age
	public int compareTo(Student s) {
		return this.age > s.age ? 1 : this.age < s.age ? -1 : 0; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// write toString method OR use Override toString method
	public String toString(){
		return "[name = " + name  + ", age = "  + age + "]";
	}
}
