
package pro6_2NestedInner;
  
// Member Inner class ... a member to the class 
//What is the internal code generated by the compiler for member inner class? ....Outer$Inner
//Can we define an interface within the class/inside the class? Yes, and it is known as a nested interface.

public class MemberInner {
	private int data=30;  
	
	//A non-static class that is created inside a class but outside a method is called member inner class.
	 class Inner{  // inner class
	  void msg(){System.out.println("data is " + data);}  
	 } 	 
	 public static void main(String args[]){  
		// If you want to instantiate the inner class, you must have to create the instance of the outer class. 
	  MemberInner obj = new MemberInner();   // create outer object 
	  MemberInner.Inner in = obj.new Inner();  // create inner object by using outer class object
	  in.msg(); 
	  //The Member inner class has the reference of Outer class that is why it can 
	  //access all the data members of Outer class including private.
	 }  
}
/*     Advantage of Java inner classes/Nested class
     1. it can access all the members (data members and methods) of the outer class, including private.
     2. are used to develop more readable and maintainable code because it logically group 
        classes and interfaces in one place only.
     3. Optimization: It requires less code to write.
     //Difference between nested class and inner class in Java
      //An inner class is a part of a nested class. Non-static nested classes are known as inner classes.
     
*/