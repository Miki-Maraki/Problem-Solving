package pro4_1;

import java.time.LocalDate;

public class DeptEmployee {
	private String name;
	double salary;
	LocalDate hireDate;
	
	public DeptEmployee(String name, double salary, int year, int month, int dayOfMonth) {
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(year, month, dayOfMonth);
	}
	public double computeSalary(){
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "DeptEmployee [name=" + name + ", salary=" + salary + ", hireDate=" + hireDate + "]";
	}
}
