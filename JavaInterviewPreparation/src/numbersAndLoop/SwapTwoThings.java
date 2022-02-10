package numbersAndLoop;

//Swapping two String, two numbers using a Temporary Variable
public class SwapTwoThings {
	
	public static void main(String [] args) {
		String name1 = "Mike";
		String name2 = "Bob";
		
		String temp = "Mike"; // putting the value of name1 into temp
		 name1 = name2;       // putting the value of name2 into name1
		 name2 = temp;        // putting the value of name1/temp into name2
		 System.out.println("name1 : " + name1); // Bob
		 System.out.println("name2 : " + name2); // Mike
		 
		 int a = 23;
		 int b = 99;
		 int tem = 23;
		 a = b;
		 b = tem;
		 System.out.println("the value of a : " + a); // 99
		 System.out.println("the value of b : " + b); // 23
		 
		 //Swapping two numbers without using a Temporary Variable
		 float x = 34.0f;
		 float y = 100.0f;
		 x = x - y; //-66
		 y = y + x; // 100 +(-66)    => 34
		 x = y - x;  // 34 - (-66)   => 100
		 System.out.println("the value of x : " + x); // 100.0
		 System.out.println("the value of y : " + y); // 34.0
	}

}
