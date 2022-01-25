package pro3_2;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	/*
	 * private Account savingsAcct; private Account checkingAcct; private Account
	 * retirementAcct;
	 */
	public AccountList accounts; // needs AccountList class
	public String name;
	LocalDate hireDate;
	int flag1, flag2, flag3;

	public Employee(String name, int year, int month, int day) {
		this.name = name;
		this.hireDate = LocalDate.of(year, month, day);
		accounts = new AccountList(); // this is under Employee constructor
	}

	public void createNewChecking(double startAmount) {
		Account acct = new CheckingAcct(this, startAmount); // this helps to represent Employee e with out passing it
		// accounts = new AccountList();
		accounts.add(acct);
		flag1++;
	}

	public void createNewSavings(double startAmount) {
		Account acct = new SavingAcct(this, startAmount); // this helps to represent Employee e with out passing it
		// accounts = new AccountList();
		accounts.add(acct); // bc calling AccountList.add(acct) == accounts.add(acct)
		flag2++;
	}

	public void createNewRetirement(double startAmount) {
		Account acct = new RetirementAcct(this, startAmount);
		accounts.add(acct);
		flag3++;
	}

	public void makeDeposit(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex);
		// accounts = new AccountList();
		selected.makeDeposit(amt);
	}

	public void withdraw(int accountIndex, double amt) {
		Account selected = accounts.get(accountIndex); // == Account selected = new AccountList()
		// accounts = new AccountList();
		selected.withdraw(amt);
	}

	public String getFormattedAcctInfo(int x, int y) {
		String str = accounts.toString(x, y);
		return str;
	}

	public String getName() {
		return this.name;
	}
}
