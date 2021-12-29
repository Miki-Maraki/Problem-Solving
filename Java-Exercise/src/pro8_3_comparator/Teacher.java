package pro8_3_comparator;

import java.util.Comparator;

public class Teacher implements Comparator<Teacher>{
	private int id;
	private String name;
	private int age;
	private double salary;

	public Teacher(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;	
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	public void setAge( int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compare(Teacher t1, Teacher t2) {
		// TODO Auto-generated method stub
		return 0;
	}
	public String toString () {
		String newline = System.getProperty("line.separator");
		return newline + "[Id= " + id + ", Name= " + name + ", Age = " + age + ", Salary = " + salary + "]";
	}

}
