package pro4_1;

public class Secretary extends DeptEmployee{
	
	double overtimeHours;
	
	public Secretary(String name, double overtimeHours, double salary, int year, int month, int dayOfMonth) {
		super (name, salary, year, month, dayOfMonth);
		this.overtimeHours = overtimeHours;
	}
	
	public double computeSalary(double overtimeHours, double salary){
		return salary + 12*overtimeHours;
	}
	
	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	public double getOvertimeHours() {
		return overtimeHours;
	}

}
