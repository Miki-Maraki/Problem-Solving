package arrayAndList;

// write a palindrome method
// A Palindrome number is a number that is the same after reverse

public class Palindrome {
	
	public boolean checkPalindrome(int[] arr) {
		boolean isTrue = false;  //  boolean variable/field
		if(arr == null || arr.length ==0)              // Edge case testing
			return false;
		for (int i = 0; i < arr.length; i++ ) {
			for(int j = arr.length-1; j >= 0; j--) {
				if(arr[i] == arr[j]) {
					isTrue = true;
				}else {
					isTrue = false;	
					break;
				}
			}
		}
		return isTrue;
	}
	public static void main(String [] args) {
		
		int [] arr = new int [] {5, 9, 6, 8, 6, 5};
		Palindrome p = new Palindrome();
		
		System.out.println(p.checkPalindrome(new int [] {5, 9, 6, 8, 6, 9, 5}));
		System.out.println(p.checkPalindrome(arr));
	}

}
