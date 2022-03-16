package polymorsim;

// Is final method inherited? Can We Override Final Method in Java?
// Yes, final method is inherited but you cannot override it.

public class Bike {

	final void run() {  // final method... can be inherited
		System.out.println("running...");
	}
}

class Honda2 extends Bike {
	
	public static void main(String [] args) {
		Honda2 h = new Honda2(); 
		    h.run();   // running... inherited 
	}
}


