package pro6_2NestedClassAndInterface;

// nested interface
  public interface Showable {  // nested main interface 
	void show();

	public interface Message {        // interface 
		void msg();
	  }
  }
   class TestNestedInterface1 implements Showable.Message {    // nested class
	   public void msg() {
		   System.out.println("Hello nested interface");
		   }

	public static void main(String args[]) {
		Showable.Message mg = new TestNestedInterface1(); // up casting here
		mg.msg();
	}
}  // end of class
   
   //Can we define a class inside the interface? Yes e.g., as follows
    class Post{             // main class
	   
	   interface Message{   // interface nested class
	    void msg();  
	   }  
	 }  
	   
	 class TestNestedInterface2 implements Post.Message{  // nested class
		 
	  public void msg(){
		  System.out.println("Hello nested interface");
		  }   // method 
	   
	  public static void main(String args[]){  
	   Post.Message message = new TestNestedInterface2(); //up casting here  
	   message.msg();  
	  }  
	 }  