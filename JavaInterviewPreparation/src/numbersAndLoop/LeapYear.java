package numbersAndLoop;

public class LeapYear {

	public static boolean findLeapYear(int year) {
		if (year % 4 == 0) {
			return true; // System.out.println("Leap Year");
		} else
			return false;//// System.out.println("Not a Leap Year");
	}

	public static void main(String[] args) {

		System.out.println(findLeapYear(2018) ? "Leap Year" : "Not a Leap Year");

		System.out.println(findLeapYear(2020) ? "Leap Year" : "Not a Leap Year");
	}

}
