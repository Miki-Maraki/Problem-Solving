package pro11hashcode;

import java.util.Calendar;
import java.util.GregorianCalendar;

//lesson11.default hash code;

public class Person {
	String firstName;
	String lastName;
	double salary;
	Calendar dob;
	public Person(String fname, String lname, double salary, GregorianCalendar dob) {
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
		this.dob = dob;
	}
	
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return firstName.equals(p.firstName)
				&& lastName.equals(p.lastName) 
				&& salary == p.salary;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getSalary() {
		return salary;
	}
	public Calendar getDob() {
		return dob;
	}
	public static void main(String[] args) {
		Person p = new Person("Joe", "Smith", 100000, new GregorianCalendar(1988, 5, 5));
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(Integer.toHexString(p.hashCode()));

	}

}
