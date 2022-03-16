
package numbersAndLoop;

public class EvenOrOddNumber {
	
	public void evenOrOdd(int num) {
		if(num / 2 == 0) {
			System.out.println("Number " + num + " is even ");
		}else {
			System.out.println("Number " + num + " is odd ");
		}
	}

	public static void main(String [] args) {
		EvenOrOddNumber n = new EvenOrOddNumber();
		n.evenOrOdd(8);
		//n.evenOrOdd(46);
		//n.evenOrOdd(61);
	}
}
