package pro3_2;

public class CheckingAcct extends Account {

	private static String ACCOUNT_TYPE;

	CheckingAcct(Employee e, double amount) {
		super(e, amount);
		this.ACCOUNT_TYPE = "Checking";
	}

	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit amount: " + amount + "\n");
	}

	public void withdraw(double amount) {
		if (balance > amount) {
			balance = balance - amount;
		}
		System.out.println("Insuccifient balance");
	}

	public String getAcctType() {
		return ACCOUNT_TYPE;
	}

	public double getBalance() {
		return balance;
	}

}
