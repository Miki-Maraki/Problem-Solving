package numbersAndLoop;

// identify if a person is eligible to vote

public class EligibleVote {
	
	public void isEligible(int age) {
		
		if(age > 18) {
			System.out.println("The person is eligible to vote");
		}else {
			System.out.println("The person is not eligible to vote");
		}
	}
	public static void main(String [] args) {
		
		EligibleVote e = new EligibleVote();
		e.isEligible(19);
	}

}
