package multithread;

// creating thread
//By implementing Runnable interface

public class Bicycle implements Runnable {
	
	public void run() { // method
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		Bicycle b1 = new Bicycle();  // create bicycle object
		Thread t1 = new Thread(b1);  // Using the constructor Thread(Runnable r), create Thread object
		t1.start();        // calling the method start() that found in Thread interface
	}
	// Whenever the start() method is called by a thread  the run() method is invoked  
}
