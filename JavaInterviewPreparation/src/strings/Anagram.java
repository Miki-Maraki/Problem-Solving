package strings;

/*
 An Anagram is a word formed by reshuffling or rearranging the letters of a different word; the vital point in 
 an anagram is that the letters can be used only once and should not be repeated in the new word. 
 An Anagram is a word having the same number of letters. The count here matters a lot.
 */
public class Anagram {
	
	public static boolean isAnagram(String word, String word2) {
		if (word.length() != word2.length())
			return false;

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = word2.indexOf(c);
			// If index of any character is -1, then two strings are not anagrams
			// If index of character is not equal to -1, then remove the character from the String
			if (index != -1) {
				word2 = word2.substring(0, index) + word2.substring(index + 1, word2.length());
			} else
				return false;
		}
		return word2.isEmpty();
	}

	public static void main(String[] args) {
		
		String w = "java8";     // literal string 
		String a = "a8jav";
		System.out.println("java8 and a8jav are anagrams : " + isAnagram(w, a));//t
		
		String s = "listen";
		String st = "silent";
		System.out.println("listen and silent are anagrams : " + isAnagram(s, st));//t
		
		String sr = "read";
		String str = "dared";
		System.out.println("read and dared are anagrams : " + isAnagram(sr, str));//f
	}

}
