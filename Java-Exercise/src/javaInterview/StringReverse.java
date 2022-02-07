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
		// using API methods

		// To reverse String in Java - Use StringBuffer reverse() method
		String word = "HelloWorld";
		StringBuffer sb = new StringBuffer(word); // change string to stringBuffer
				sb.reverse();
		System.out.println(sb);  // dlroWolleH

		// To reverse String in Java - use StringBuilder reverse() method
		word = "WakeUp";
		StringBuilder sbr = new StringBuilder(word); // change string to StringBuilder
				sbr.reverse();
		System.out.println(sbr);   // pUekaW
			
	}
}
