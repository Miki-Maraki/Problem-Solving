package numbersAndLoop;

import java.util.Scanner;
// switch statements 
public class Month {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your favorite number 1 to 12 ");
		int num = scan.nextInt(); // here num = favorite number
		switch (num) {
		case 1: System.out.println("January is your lucky month");
			break;
		case 2: System.out.println("Febuary is your lucky month");
			break;
		case 3: System.out.println("March is your lucky month");
			break;
		case 4: System.out.println("April is your lucky month");
			break;
		case 5: System.out.println("May is your lucky month");
			break;
		case 6: System.out.println("June is your lucky month");
			break;
		case 7: System.out.println("July is your lucky month");
			break;
		case 8: System.out.println("August is your lucky month");
			break;
		case 9: System.out.println("Septmeber is your lucky month");
			break;
		case 10: System.out.println("October is your lucky month");
			break;
		case 11: System.out.println("November is your lucky month");
			break;
		case 12: System.out.println("December is your lucky month");
			break;
		}
	}
}
