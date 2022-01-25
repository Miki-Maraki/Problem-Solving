package multithread;

//by extending Thread class and overriding its run() method:
public class Motor extends Thread {
	
	  public static void main(String[] args) {
		    Motor thread = new Motor();
		    thread.start();   // calling the method start() that found in Thread interface
		 // Whenever the start() method is called by a thread  the run() method is invoked
		   System.out.println("This code is outside of the thread");
	 }
	  
	  
	  
	  
		  public void run() { // method
		    System.out.println("This code is running in a thread");
		  }

}
