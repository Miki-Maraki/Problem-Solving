package finalProject;

public class Student { // Create the student class

	private String name;
	private int id;
	private int[] grades = new int[3];

	// Create a constructor
	public Student(String yName, int yID) {
		name = yName;
		id = yID;
		grades[0] = -1; // -1 ????
		grades[1] = -1;
		grades[2] = -1;
	}

	// Create a student functions/methods
	public String getName() {
		return name;
	}

	public int getID() {
		return id;
	}

	public int getGrade(int index) {
		return grades[index];
	}

	public int[] getGrades() {
		return grades;
	}

	public double getAverage() {
		return (grades[0] + grades[1] + grades[2]) / 3.0;
	}

	public char getLetterGrade() {     // a method with char return type 
		double avgGrd = getAverage();
		if (avgGrd >= 90)
			return 'A';
		else if (avgGrd >= 80)
			return 'B';
		else if (avgGrd >= 70)
			return 'C';
		else if (avgGrd >= 60)
			return 'D';
		else
			return 'F';
	}

	public void setName(String yName) {
		name = yName;
	}

	public void setID(int yID) {
		id = yID;
	}

	public void setGrade(int index, int grade) {
		grades[index] = grade;
	}

	public void setGrades(int[] yGrades) {
		grades[0] = yGrades[0];
		grades[1] = yGrades[1];
		grades[2] = yGrades[2];
	}

}
