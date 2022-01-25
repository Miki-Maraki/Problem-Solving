package pro3_2;

public class SavingAcct extends Account {
	private static String ACCOUNT_TYPE;

	SavingAcct(Employee e, double amount) {
		super(e, amount);
		this.ACCOUNT_TYPE = "Saving";
	}

	public void makeDeposit(double amount) {
		balance = balance - amount;
		System.out.println("Deposit amount: " + amount + "\n");
	}

	public void withdraw(double amount) {
		if (balance > amount) {
			balance = balance - amount;
		}
		System.out.println("Insufficient balance");
	}

	public String getAcctType() {
		return ACCOUNT_TYPE;
	}

	public double getBalance() {
		return balance;
	}
}
