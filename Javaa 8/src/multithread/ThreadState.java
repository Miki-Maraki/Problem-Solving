package multithread;
//It has two ways to create multithreading. 1. Thread class extends Object class 
//2. Thread class implements Runnable interface

// Runnable interface have only one method named run()
public class ThreadState implements Runnable{ //2. Thread class implements Runnable interface
	public static Thread t1;  
	public static ThreadState obj;  
	  
	// main method   
	public static void main(String args[])  {  
	// creating an object of the class ThreadState  
	ThreadState obj = new ThreadState();  // create new obj
	Thread t1 = new Thread(obj);           // pass obj to the new created object
	  
	// thread t1 is spawned   
	// The thread t1 is currently in the NEW state.  
	System.out.println("The state of thread t1 after spawning it - " + t1.getState());  
	  
	// invoking the start() method on   
	// the thread t1  
	t1.start();  
	  
	// thread t1 is moved to the Runnable state  
	System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());  
	}
	
	// implemented method provide for Runnable
	public void run() { // is used to perform action for a thread.
	} 
	
	

}
