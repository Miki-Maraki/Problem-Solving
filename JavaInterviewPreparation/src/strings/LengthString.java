package strings;

// How to find length of string in java without using length() method

public class LengthString {
 
	    // Using toCharArray
	public static int lengString(String str) {
	  int length = 0;
	  char[] strCharArray = str.toCharArray();
	  for(char c:strCharArray) {
	   length++;
	  }
	  return length;
	}
	public static void main(String args[]){
		 
		  String helloWorld = "This is hello world";
		  System.out.println("length of helloWorld string is :" + lengString(helloWorld));
		  }
}
