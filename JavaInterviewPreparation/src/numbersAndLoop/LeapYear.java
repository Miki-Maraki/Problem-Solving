package numbersAndLoop;

public class LeapYear {

	public static boolean findLeapYear(int year) {
		if (year % 4 == 0) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {

		System.out.println(findLeapYear(2018) ? "Leap Year" : "Not a Leap Year");

		System.out.println(findLeapYear(2020) ? "Leap Year" : "Not a Leap Year");
	}

}
