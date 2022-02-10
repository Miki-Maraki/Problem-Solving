package numbersAndLoop;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		// byte -> short(32767) -> char(65535) -> int -> long -> float -> double
		// wrapper class ... convert primitive data types into objects
		
		// Autoboxing: Automatic conversion of primitive types to the object
		char chr = 'a';
		Character q = chr; // Autoboxing- primitive to Character object conversion
		System.out.println("the value of character q is : " + q); // a
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(25); // Autoboxing because ArrayList stores only objects
		System.out.println(arrayList.get(0)); // 25 printing the values from object

		int k = 10;
		Integer intobj = new Integer(k); // wrapping around Integer object
		System.out.println(intobj);
		
		float ft = 18.6f;              // float data type
		Float floatobj = new Float(ft); // wrapping around Float object
		System.out.println("the value of floatobj is " + floatobj);
		
// Unboxing converting an object of a wrapper class to its corresponding primitive type
		Character hh = 'b';
		char w = hh; // unboxing - Character object to primitive conversion
		System.out.println("the value of w is " + w); // b
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(24);
		int num = arrList.get(0); // unboxing because get method returns an Integer object
		System.out.println(num); // 24

// the ff methods are used to get the value associated with the corresponding wrapper object: intValue(),
// byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
		System.out.println(myInt.intValue()); // 5
		System.out.println(myDouble.doubleValue()); // 5.99
		System.out.println(myChar.charValue()); // A
	}

}
