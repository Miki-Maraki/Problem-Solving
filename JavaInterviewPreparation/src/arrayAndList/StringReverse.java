package arrayAndList;

public class StringReverse {
	
	public void stRev(String ss) {
		
		System.out.println("Given string");
		char [] c = ss.toCharArray();       // change string to charArray
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		
		System.out.println("\nAfter string reverse");
		for(int i = c.length-1; i >= 0; i--) {
			System.out.print(c[i]);	
		}
	}
 
	public static void main(String [] args) {
		
		String ss = new String ("welcometojava");
		
		StringReverse sr = new StringReverse();
		
		sr.stRev(ss);
	}
}


