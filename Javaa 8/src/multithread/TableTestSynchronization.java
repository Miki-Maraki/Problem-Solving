package multithread;

public class TableTestSynchronization {

	public static void main(String args[]) {
		
		TableSychronization tb = new TableSychronization();// only one object from Table class
		MyThread1 myTh1 = new MyThread1(tb);
		MyThread2 myTh2 = new MyThread2(tb);
		// first execute  myTH1
		myTh1.start(); // n = 5 -> 5, 10, 15, 20, 25  
		// then execute myTh2
		myTh2.start(); //n =100 -> 100, 200, 300, 400, 500
	}
	// Whenever the start() method is called by a thread  the run() method is invoked
}
