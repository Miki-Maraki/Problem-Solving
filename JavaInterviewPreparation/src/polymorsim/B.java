package polymorsim;

// sub class
public class B extends A{
	
	// Static is removed here (Causes Compiler Error)
  //  public void display() {
  //       System.out.println("Non-static method from Derived");
  //   }
     
    // Static is added here (Causes Compiler Error)
    public void print() {
        System.out.println("Static method from Derived");
    }
}
