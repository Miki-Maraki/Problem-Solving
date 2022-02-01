package multithread;

public class MyThread2 extends Thread {

	TableSychronization t;

	MyThread2(TableSychronization t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);// here n=100
	}

}
