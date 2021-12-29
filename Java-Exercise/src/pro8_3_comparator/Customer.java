package pro8_3_comparator;

import java.util.Comparator;
// A comparator interface is used to order the objects of user-defined classes. 
//  A comparator object is capable of comparing two objects of the same class.

public class Customer implements Comparator<Customer>{
	private int id;
	private String name;
	private double salary;

	public Customer(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int compare(Customer c1, Customer c2) {   // implemented method to sort by using salary
		if (c1.getSalary() < c2.getSalary()) {
			return -1;
		} else if (c1.getSalary() > c2.getSalary()) {
			return 1;
		} else if (c1.getSalary() == c2.getSalary()) {  
			return c1.getId() - c2.getId();               //  sort by using id
		}
		return 0;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return " [id = " + id + ", name = " + name + ", salary = " + salary + "]";
	}

}
