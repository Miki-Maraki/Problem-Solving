package strings;

public class StringMain {
	
	public String revString(String str) {          // method
		StringBuilder st = new StringBuilder(str);
		return st.reverse().toString();
	}
	
	public static void main(String args[]) {
		String s = "SachinTendulkar";
		System.out.println("Original String: " + s);
		System.out.println("Substring starting from index 6: " + s.substring(6));// Tendulkar
		System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 6)); // Sachin n-1 means 6-1=5
																							// excluding index 6
		String st = "  Sachin  ";
		System.out.println(st); // Sachin
		System.out.println(st.trim()); //Sachin
        
		 // A scenario where NullPointerException occurs
		//Emp e1 = null; // create null object but has no value
		// System.out.println(e1.getName());// print nothing
		
		// by using StringBuffer ... create one object
		StringBuffer sb = new StringBuffer("Test");
		sb.append("now");
		sb.append("then");
		System.out.println("the value of sb is : " + sb); // Testnowthen
		//sb = "test"; sb = testnow , sb = Testnowthen// finally created 1 object i.e the last
		
		//by using String ... three object will be created
		String stt = "test"; //test
		stt = stt + "now";   //stt=testnow
		stt = stt + "then";  // stt=testnowthen ... means they use the same reference
		System.out.println("the value of stt is : " + stt); //testnowthen
		
		StringMain em = new StringMain();
		System.out.println("the rev value of mike is :" + em.revString("Mike")); // ekiM
	}
}
