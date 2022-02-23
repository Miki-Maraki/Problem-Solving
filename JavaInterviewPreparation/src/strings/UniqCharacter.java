package strings;

import java.util.HashSet;

public class UniqCharacter {
        // 1. By Using HashSet
	public static boolean hasUniqueChars(String word) { //
		// Hash set holds unique items
		HashSet<Character> alphaSet = new HashSet<Character>();
		for (int i = 0; i < word.length(); i++) { // i = index
			char c = word.charAt(i);
			// If Hashset's add method return false,that means it is already present in
			// HashSet
			if (!alphaSet.add(c))
				return false;
		}
		return true; // means word is unique
	}

	public static void main(String[] args) {
		System.out.println("java2blog has all unique chars : " + hasUniqueChars("java2blog"));// f aa
		System.out.println("Apple has all unique chars : " + hasUniqueChars("apple")); // f  pp
		System.out.println("index has all unique chars : " + hasUniqueChars("index")); // t
		System.out.println("world has all unique chars : " + hasUniqueChars("world")); // t
	}
/*
     // 2. By using indexOf and lastIndexOf methods.
   public static boolean hasAllUniqueChars (String word) {
      for(int i = 0; i < word.length(); i ++)   {
         char c =word.charAt(i);
         if(word.indexOf(c)!=word.lastIndexOf(c))
              return false;
     }
     return true;
 }
 */
}
