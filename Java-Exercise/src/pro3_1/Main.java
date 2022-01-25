package pro3_1;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee("mike", "miko", 5000.0, 2021, 11, 7);
		// Account acc = new Account(employee, acctType, );
		// String acc.new Account();
		Account chAc = new Account(employee, AccountType.checking, 300);
		Account svAc = new Account(employee, AccountType.savings, 300);
		Account rtAc = new Account(employee, AccountType.retirement, 300);
/*		Account[] accArr = { chAc, svAc, rtAc }; // array data for one employee
		for (int i = 0; i < accArr.length; i++)
			System.out.println(accArr[i].toString());
*/		
		Employee employee1 = new Employee("bob", "miko", 4000.0, 2021, 11, 7);//when we have more employee
		Account chAc1 = new Account(employee1, AccountType.checking, 350);
		Account svAc1 = new Account(employee1, AccountType.savings, 350);
		Account rtAc1 = new Account(employee1, AccountType.retirement, 400);

		Account[] accArr = { chAc, svAc, rtAc, chAc1, svAc1, rtAc1 }; // array data for two employee
		for (int i = 0; i < accArr.length; i++)
			System.out.println(accArr[i].toString());
		
	}

}
