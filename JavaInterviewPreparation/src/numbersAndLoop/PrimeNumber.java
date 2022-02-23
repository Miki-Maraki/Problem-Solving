package numbersAndLoop;

// Write a program to check the given number is a prime number or not?
public class PrimeNumber {

	public boolean isPrimeNumber(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String a[]) {
		PrimeNumber pn = new PrimeNumber();
		System.out.println("Is 17 prime number? " + pn.isPrimeNumber(17)); // t
		System.out.println("Is 19 prime number? " + pn.isPrimeNumber(19)); // t
		System.out.println("Is 15 prime number? " + pn.isPrimeNumber(15)); // f?
		System.out.println("Is 21 prime number? " + pn.isPrimeNumber(21));
		System.out.println("Is 56 prime number? " + pn.isPrimeNumber(56));
		System.out.println("Is 57 prime number? " + pn.isPrimeNumber(57)); //f?
		System.out.println("Is 58 prime number? " + pn.isPrimeNumber(58));
		System.out.println("Is 59 prime number? " + pn.isPrimeNumber(59)); //t
	}

}
