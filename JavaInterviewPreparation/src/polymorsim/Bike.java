package polymorsim;

// Is final method inherited? Can We Override Final Method in Java?
// Yes, final method is inherited but you cannot override it.

public class Bike {

	final void run() {  // final method
		System.out.println("running...");
	}
}
/*
class Honda2 extends Bike {
	
	public static void main(String [] args) {
		Honda2 h = new Honda2();
		    h.run();   // running... 
	}
	
public class Singleton{
	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton(){
	}
	
	public static Singleton getInstance(){
	   return INSTANCE;
	}
}
*/

