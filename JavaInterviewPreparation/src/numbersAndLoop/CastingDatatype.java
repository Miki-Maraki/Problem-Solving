package numbersAndLoop;

import java.util.ArrayList;

public class CastingDatatype {
	
	public static void main(String [] args) {
		//byte -> short(32767) -> char(65535) -> int -> long -> float -> double
		        
		double d = 50.00d;
		float f = (float) d;     // 50.0
		System.out.println(f);
		float ff = 60.0f;
		double dd = ff;          //60.0
		System.out.println(dd);    
		
		char cr = 'B';
		short st =  (short) cr; // 66
		System.out.println(st);
		
		short s = 65;                    // short max value is 32767
		char c = (char) s;                // char max value is 65535 
		System.out.println(c); // A
		
		int y = 100;
		short sr = (short) y;
		System.out.println(sr); // 100
		
		short h = 70;
		int x = h;
		System.out.println(x); // 70
		
		char ch = 'A';
		String str = Character.toString(ch);
		System.out.println(str);             // A
		
		String rn = "G";
	    char ha  = rn.charAt(0);
		System.out.println(ha);
		
		String srn = "Java";
		char cha  = srn.charAt(2);  // v
		System.out.println("the value of cha is " + cha); // v
		
	}

}
