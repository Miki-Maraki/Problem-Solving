package pro6_2NestedInner;

public class LocalInner {
	private int data = 30;// instance variable
	void display() { // method of the outer class
		
/*	local Inner class... created inside a method
	Local Inner classes are not a member of any enclosing classes... are member of a block/method
	Access specifiers (public, private, etc) are not used to affect access of the inner class since 
    access to the inner class is always restricted to the local access within the method body. 
*/		
		class Local { // local inner class  inside a method .... it cannot be invoked from outside the method.
			void msg() { // method of local inner class
				System.out.println("The data is : " + data);
			}
		}
		Local loc = new Local(); // If you want to invoke the methods of the local inner class,
		loc.msg(); // you must instantiate this class inside the method.

	} // end of method

	public static void main(String args[]) {
		LocalInner obj = new LocalInner();
		obj.display();
	}
/*// other Exmple
	class OuterClass {
		private int data = 30;// instance variable

		void display() {
			int value = 50;// local variable 
			
			class Local {        // local inner class inside a method 
				void msg() {
					System.out.println("the value of int is " + value);
				}
			}
			Local lin = new Local();
			lin.msg();
		}

		public static void main(String args[]) {
			OuterClass obj = new OuterClass();
			obj.display();
		}
	}
*/	
}
