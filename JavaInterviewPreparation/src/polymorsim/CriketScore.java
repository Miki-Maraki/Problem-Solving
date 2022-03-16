package polymorsim;

import java.util.Arrays;

public class CriketScore {

	// Instance Variables - constitute the state of an object
	private int score;

	// Behavior - all the methods that are part of the class
	// An object of this type has behavior based on the
	// methods four, six and getScore
	public void four() {
		score = score + 4;
	}

	public void six() {
		score = score + 6;
	}

	public int getScore() {
		return score;
	}

	public static void main(String[] args) {
		CriketScore scorer = new CriketScore();
		scorer.six();
		// State of scorer is (score => 6)
		scorer.four();
		// State of scorer is (score => 10)
		System.out.println("score is " + scorer.getScore());

		// Why should you always use blocks around if statement?
		int number = 5;
		if (number < 0) // condn is false. So the line in if is not executed.
			number = number + 10; // Not executed
		number++; // This statement is not part of if. Executed.
		System.out.println(number); // prints 6

// There can	be	multiple	statements	in	Initialization	or	Operation	separated by	commas
		for (int i = 0, j = 0; i < 10; i++, j--) {
			System.out.print(j); // print 0-1-2-3-4-5-6-7-8-9
		}
		
	// How	do	you	compare	two	arrays?
	// Arrays	can	be	compared	using	static	method	equals	defined	in	Arrays	class.	
	// Two	arrays	are	equal	only	if	
	// they	have	the	same	numbers	in	all	positions	and	have	the	same	size.
		
				int[]	numbers1	=	{	1,	2,	3	};
				int[]	numbers2	=	{	4,	5,	6	};
				System.out.println(Arrays.equals(numbers1,	numbers2));	//false
				int[]	numbers3	=	{	1,	2,	3	};
				System.out.println(Arrays.equals(numbers1,	numbers3));	//true
	}

}
