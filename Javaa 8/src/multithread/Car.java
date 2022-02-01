package multithread;

//1st way of Thread creating by using extending Thread class

public class Car extends Thread {
	
	public void run() {   // method
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		Car t1 = new Car();
		t1.start();   // calling the method start() that found in Thread interface
	}
	// Whenever the start() method is called by a thread  the run() method is invoked
}
