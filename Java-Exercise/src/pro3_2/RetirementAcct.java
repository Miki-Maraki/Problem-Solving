package pro3_2;

public class RetirementAcct extends Account {
	static String ACCOUNT_TYPE;

	RetirementAcct(Employee e, double amount) {
		super(e, amount);
		this.ACCOUNT_TYPE = "Retirement";
	}

	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit amount: " + amount);
	}

	public void withdraw(double amount) {
		if (balance > amount) {
			balance = balance - amount;
		}
		System.out.println("Insuffiecient balance");
	}

	public String getAcctType() {
		return ACCOUNT_TYPE;
	}

	public double getBalance() {
		return balance;
	}

}
