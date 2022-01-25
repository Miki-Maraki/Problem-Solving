package pro3_1;

public class Account {
/*	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
*/	private final static double DEFAULT_BALANCE = 0.0;
	public double balance;
	public AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		this.employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	protected Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double val) {
		// implement
		balance = balance + val;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if (balance > amount) {
			balance = balance - amount;
			return true;
		}
		return false;
	}

}
