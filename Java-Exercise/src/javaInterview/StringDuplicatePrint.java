package javaInterview;

// How to Print duplicate characters from String? 

public class StringDuplicatePrint {

	public static void main(String[] args) {
		String str = "welcome to the java programming language";
        
		// change String to char to find/print duplicate array
		char[] ca = str.toCharArray();
		System.out.print(ca); //welcome to the java programming language
		
		System.out.println(" duplicate charactors are ...");
		for (int i = 0; i < ca.length; i++) {
			for (int j = i + 1; j < ca.length; j++)
				if (ca[i] == ca[j]) {
					System.out.print(ca[j] + ", ");
				}
		}
	}
}
