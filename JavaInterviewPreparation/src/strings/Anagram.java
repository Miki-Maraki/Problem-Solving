package strings;

public class Anagram {
	
	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length())
			return false;

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = anagram.indexOf(c);
			// If index of any character is -1, then two strings are not anagrams
			// If index of character is not equal to -1, then remove the character from the String
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else
				return false;
		}
		return anagram.isEmpty();
	}

	public static void main(String[] args) {
		String word = "java8";     // literal string 
		String anagram = "a8jav";

		System.out.println("java8 and a8jav are anagrams :" + isAnagram(word, anagram));
	}

}
