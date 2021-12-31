package pro11hashcode;

import java.util.HashMap;
//Problem 11-1
public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord = new HashMap<>();

	public void addEntry(String date, double salary) {
		// implement
		salaryRecord.put(date, salary);
	}
	public void printPaymentAmount(String date) {
		// implement
		if (!salaryRecord.containsKey(date)) {
			System.out.println(
					this.getFirstName() + " " + this.getLastName() + " " + "did not receive paycheck on " + date);
			return;
		}
		System.out.println(this.getFirstName() + " " + this.getLastName() + " " + "was paid " + salaryRecord.get(date)
				+ " on " + date);
	}
	public void printAveragePaycheck() {
		// implement
		double sum = 0;
		for (double d : salaryRecord.values()) {
			sum = sum + d;
		}
		double avg = sum / salaryRecord.size();
		System.out.println("Average paycheck for " + this.getFirstName() + " " + this.getLastName() + " was " + avg);
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for (int i = 1; i <= 12; ++i) {
			e.addEntry(i + "/15/2011", 3070 + 5 * i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
	}
}
