package javaInterview;

public class StringReverse {

	// How to Reverse String in Java with or without StringBuffer
	public static String reverse(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}
		String str = ""; // mekdes
		for (int i = s.length() - 1; i >= 0; i--) {
			str = str + s.charAt(i);
			System.out.println(str);
		}
		return str; // sedkem
	}
	
	public static void main(String args[]) {
      

		// quick wasy to reverse String in Java - Use StringBuffer
		String word = "HelloWorld";
		String reverse = new StringBuffer(word).reverse().toString();
		System.out.printf(" original String : %s , reversed String %s  %n", word, reverse);
		System.out.println(reverse);

		// another quick to reverse String in Java - use StringBuilder
		word = "WakeUp";
		reverse = new StringBuilder(word).reverse().toString();
		System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
		System.out.println(reverse);
		
		
	}

}
