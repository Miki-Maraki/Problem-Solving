package pro4_1;

public class Professor extends DeptEmployee{
	 
	private int numberOfPublications;
	
	public Professor (String name, int numberOfPublications, double salary, int year, int month, int dayOfMonth) {
		super(name, salary, year, month, dayOfMonth);
		this.numberOfPublications = numberOfPublications;
	}
	
	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	public int getNumberOfPublications() {
		return numberOfPublications;
	}
	
}
