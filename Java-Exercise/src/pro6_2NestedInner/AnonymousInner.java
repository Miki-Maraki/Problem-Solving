package pro6_2NestedInner;

// Anonymous inner class.....a class that has no name
// it is useful to making an instance of an object and when we want to override a method of class or interface

public abstract class AnonymousInner {
	abstract void eat();
   }

   class TestAnonymousInner {        // Anonymous inner class
	   public static void main(String args[]) {

		AnonymousInner an = new AnonymousInner() {
			void eat() {
				System.out.println("nice fruits");
			}
		};
		an.eat();
	}

}
