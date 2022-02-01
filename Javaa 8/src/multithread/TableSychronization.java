package multithread;

//example of java synchronized method  
public class TableSychronization {

	// Synchronized means there is 'trade safe'
	// All string methods have synchronized
	// Synchronized keep the processing to goes one by one
	public synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
