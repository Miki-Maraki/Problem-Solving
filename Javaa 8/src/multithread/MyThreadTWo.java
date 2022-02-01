package multithread;

// 2nd way of Thread creating by using Runnable interface

public class MyThreadTWo implements Runnable{
	
	public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){ 
		
		// creating an object of the class MyThreadTWo 
		MyThreadTWo myThread = new MyThreadTWo(); 
		
		//creating an object of the Thread 
		Thread t1 = new Thread(myThread);   // Using the constructor Thread(Runnable r)  
		t1.start(); // calling the run method to start
		
	 }  
}
