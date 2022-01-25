package pro6_2NestedClassAndInterface;

// It cannot access non-static data members and methods.
// In the Java API, LinkedList.Node and HashMap.Node are examples of static nested classes.
public class StaticInner {
	static int data = 30; // variable

	static class Inner { // static inner class
		void msg() { // a non static method
			System.out.println("data is " + data);
		}
	}
	public static void main(String args[]) {
		StaticInner.Inner obj = new StaticInner.Inner(); // create obj bc in order to call/invoke void msg()
		obj.msg();                                       // because it has instance method msg().
	}
 /*    
	//static nested class with a static method
	public class StaticOuter {
		static int data = 30;

		static class Inner {      // inner class
			static void msg() {
				System.out.println("data is " + data);
			}
		}

		public static void main(String args[]) {
			StaticOuter.Inner.msg();// no need to create the instance of static nested class
		}
	}
*/
}
/*    1.       class OuterClass {
               int x = 10;

                  class InnerClass {
                      int y = 5;
                          }
             }

      public class Main {
        public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}       // Outputs 15 (5 + 10)
 
   2.     class OuterClass {
           int x = 10;

          static class InnerClass {
              int y = 5;
                 }
     }

    public class Main {
        public static void main(String[] args) {
         OuterClass.InnerClass myInner = new OuterClass.InnerClass();
     System.out.println(myInner.y);
     }
  }             // Outputs 5 
 
 */
