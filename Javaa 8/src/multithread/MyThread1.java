package multithread;

public class MyThread1 extends Thread {

	Table t;// Table t = new Table();

	MyThread1(Table t) {// constructor
		this.t = t;
	}

	public void run() {
		t.printTable(5); // n = 5 for Table class 
	}

}
