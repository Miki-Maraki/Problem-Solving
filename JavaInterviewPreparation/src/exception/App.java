package exception;

public class App {
	
	public String revString(String str) {          // method
		StringBuilder st = new StringBuilder(str);
		return st.reverse().toString();
	}

	public static int div(int x, int n) {
		int m = 0;
		try {
			m = x / n;
		} catch (ArithmeticException e) {
			System.out.println("please enter value of n grater than 0");
			
		}finally {
			//jxjz/
		}
		return m;
	}

	public static void main(String [] args) {
		System.out.println("the value for try catch is :" + div(10,2)); //5 println method for try catch
		
		System.out.println("the value for try catch is :" + div(10,0));
		//-->>> please enter value of n grater than 0  ... hence, the value for try catch is :0
		
		System.out.println("the value for try catch is :" + div(10,3)); // 3
	}
}
//1.Unchecked Exceptions happen at run time
	// ArithmeticException
	// int a[]=new int[5];  
	//a[10]=50; //ArrayIndexOutOfBoundsException  
	//String s=null;  
	//System.out.println(s.length());//NullPointerException 
	//String s="abc";  
	//int i=Integer.parseInt(s);//NumberFormatException 
	
	//2. Checked Exceptions happen at compile time
	// syntax and semantics ...method 
	// IOException, SQLException
	//..throw used to Creates a custom error
	// throws used to Indicates what exceptions may be thrown by a method
