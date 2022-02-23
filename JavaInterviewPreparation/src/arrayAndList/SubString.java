package arrayAndList;

public class SubString {

	public static void main(String args[]) {

		String str = "acb";   // string literal 
		System.out.println("All substring of acb are:");
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				
				System.out.println(str.substring(i, j)); // a, ac, acb, c, cb, b
			}
		}
	}

}




