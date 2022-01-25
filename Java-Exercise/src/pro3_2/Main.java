package pro3_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Employee[] emps = null;
		Employee[] emps = new Employee[3]; // now there are 3 Employee who has checking, saving , retirement account
											// each other

		emps[0] = new Employee("Jim Daley", 2000, 9, 4); // employee 1
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5); // employee 2
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13); // employee 3
		// for employee 1
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		// for employee 2
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[1].createNewRetirement(9300);
		// for employee 3
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

		Scanner sc = new Scanner(System.in);
		System.out.print("A. See a report of all accounts. " + "\n" + "B. make a deposit" + "\n"
				+ "C. make a withdraw. " + "\n" + "make selection (A/B/C: ");
		String answer = sc.next();
		int x = 0;
		int y = 3;
		if (answer.equalsIgnoreCase("A")) {
			for (Employee e : emps) {
				System.out.println("ACCOUNT INFO FOR " + e.getName() + ":");
				System.out.println();
				String info = e.getFormattedAcctInfo(x, y);
				System.out.println(info);
				System.out.println();
				System.out.println();
				x = x + 3; // 3 employee
				y = y + 3; // 3 accounts
			}
		} else if (answer.equalsIgnoreCase("B")) {
			for (int i = 0; i < emps.length; i++) {
				System.out.println(i + ". " + emps[i].getName() + "\n");

			}
			System.out.println();
			int answer1 = sc.nextInt();

			System.out.println("0. checking" + "\n" + "1. savings" + "\n" + "2. retirement");
			int answer2 = sc.nextInt();
			System.out.println("Enter Ammount ");
			double ammount = sc.nextDouble();
			if (answer1 == 0)
				emps[answer1].makeDeposit(answer2, ammount);
			if (answer1 == 1)
				emps[answer1].makeDeposit(answer2 + 3, ammount);
			if (answer1 == 2)
				emps[answer1].makeDeposit(answer2 + 6, ammount);
		}

		else if (answer.equalsIgnoreCase("c")) {

			for (int i = 0; i < emps.length; i++) {
				System.out.println(i + ". " + emps[i].getName() + "\n");
			}

			System.out.println();
			int answer4 = sc.nextInt();

			System.out.println("0. checking" + "\n" + "1. savings" + "\n" + "2. retirement");
			int answer5 = sc.nextInt();
			System.out.println("Enter Ammount");
			double ammount = sc.nextDouble();
			if (answer4 == 0)
				emps[answer4].withdraw(answer5, ammount);
			if (answer4 == 1)
				emps[answer4].withdraw(answer5 + 3, ammount);
			if (answer4 == 2)
				emps[answer4].withdraw(answer5 + 6, ammount);
		}

	}
}
