package pro6_2NestedClassAndInterface;

public class Pyramids {

	public static void main(String[] args) {
        // example 1
		int term = 6;
		for (int i = 1; i <= term; i++) {
			for (int j = term; j >= i; j--) {
				System.out.print(" * ");
			}
			System.out.println();// new line
		}
          // example 2
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();// new line
		}
	}

}
/*
 * // result
 *
 * * * * * * * * * * *
 * 
 */