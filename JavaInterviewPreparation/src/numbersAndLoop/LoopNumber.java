package numbersAndLoop;

public class LoopNumber {
	
	public static void main(String [] args) {
	
	// loop of i (nested loop)
			for (int i = 1; i <= 3; i++) {             // loop of i
				for (int j = 1; j <= 3; j++) {         // loop of j
					System.out.println(i + " " + j);
// print 1 1, 1 2, 1 3, 2 1, 2 2, 2 3, 3 1, 3 2, 3 3
				} // end of i
			} // end of j
			
			int sum = 0, i = 1;
			while (i < 5) {
				sum = sum + i;
				i++;
				System.out.println(sum); // 1, 3, 6, 10  ... 1, 1+2, 3+3, 4+6 ... inside
				//the result is :Compile by: Javac LoopNumber.java AND Run by: java LoopNumber
			}
			System.out.println(sum); // 10 ... out side while
	}
}
	
