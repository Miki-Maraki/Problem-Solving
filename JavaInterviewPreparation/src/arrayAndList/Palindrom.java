package arrayAndList;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter string : ");

		String str = scanner.nextLine();
		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}

		if (str.equals(revStr)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

}
