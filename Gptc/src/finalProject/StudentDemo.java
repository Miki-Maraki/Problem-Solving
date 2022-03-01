package finalProject;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {

		// create a menu interface for the student... #3
		Scanner input = new Scanner(System.in);
		Student[] stud = new Student[20]; // creating student object
		int count = 0;
		char option;
		String sname;
		int sid;
		int grade;
		int index;

		// display the out put
		do {
			System.out.println("     MENU   ");
			System.out.println("    ******   ");
			System.out.println(" A.Add new student");
			System.out.println(" B.Enter test grades");
			System.out.println(" C.Display all students");
			System.out.println(" D.Exit the program");
			System.out.print(" Enter your option: ");
			option = input.next().charAt(0);

			switch (option) {
			case 'a':  // A. Add new student
				System.out.print("\nEnter the name of a student: ");
				sname = input.next();

				System.out.print("Enter the id of the student: ");
				sid = input.nextInt();

				stud[count] = new Student(sname, sid);
				count++;
				break;

			case 'b':    // B.Enter test grades
				if (count == 0) {
					System.out.println("No students are in the list.");
					break;
				}

				System.out.print("\nEnter the index of student: ");
				index = input.nextInt();

				if (index < 0 || index < count) {
					System.out.print("Enter grade 1 out of 100: ");
					grade = input.nextInt();
					stud[index].setGrade(0, grade);

					System.out.print("Enter grade 2 out of 100: ");
					grade = input.nextInt();
					stud[index].setGrade(1, grade);

					System.out.print("Enter grade 3 out of 100: ");
					grade = input.nextInt();
					stud[index].setGrade(2, grade);
				} else {
					System.out.println("Invalid index! The index should be >=0 and <" + count);
				}
				break;

			case 'c':   // C.Display all students
				System.out.println("\nDetails of all students:");

				if (count == 0) {
					System.out.println("No students are in the list.");
					break;
				}

				for (int i = 0; i < count; i++) {
					System.out.println("\nStudent #" + (i + 1));
					System.out.println("Name: " + stud[i].getName());
					System.out.println("ID:   " + stud[i].getID());
					System.out.println("Grade1: " + stud[i].getGrade(0));
					System.out.println("Grade2: " + stud[i].getGrade(1));
					System.out.println("Grade3: " + stud[i].getGrade(2));
					System.out.println("Average grade: " + stud[i].getAverage());
					System.out.println("Letter grade: " + stud[i].getLetterGrade());
				}

				break;

			case 'd':  // D. Exit the program
				System.out.println("Thank you.");
				break;

			default:
				System.out.println("Invalid Option!");
			}
			System.out.println();
		} while (option != 'd');

	} // end of main

}
