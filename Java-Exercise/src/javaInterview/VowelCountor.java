
package javaInterview;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// How to count Vowels and Consonants in Java String Word

public class VowelCountor {
	
	public static void main(String [] args) { 
		
		int [] arr = {3, 6, 8, 1, 23, 5, 3, 6,7};
		Set<Integer> set = new HashSet<Integer>();
		for(int s : arr) {
			set.add(s);
		}
		System.out.println(set);
		
		System.out.println("Please enter some text"); 
		Scanner reader = new Scanner(System.in); 
		String input = reader.nextLine(); 
		char[] letters = input.toCharArray(); // change string to char
		
		int count = 0; 
		for (char c : letters) { 
			switch (c) { 
				case 'a': 
				case 'e': 
				case 'i': 
				case 'o': 
				case 'u': 
					count++; 
					break; 
				default: 
			// no count increment 
			} 
		} 
		System.out.println("Number of vowels in String [" + input + "] is : " + count); 
	}
			
		
}

		


