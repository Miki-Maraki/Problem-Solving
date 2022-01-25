package pro4_1;

import java.util.Scanner;

public class Test {
	
	public static void main(String [] args) {
		
		Professor prf1 = new Professor("hmk", 10, 6000, 2021, 12, 12);
		Professor prf2 = new Professor("bmk", 10, 6000, 2021, 12, 13);
		Professor prf3 = new Professor("smk", 10, 6000, 2021, 12, 14);
		Secretary sec1 = new Secretary("bmk", 200, 6000, 2021, 12, 15);
		Secretary sec2 = new Secretary("smk", 200, 6000, 2021, 12, 16);
		
		DeptEmployee[] department = new DeptEmployee[5]; // option 1 putting data in array
		department[0] = prf1;
		department[1] = prf2;
		department[2] = prf3;
		department[3] = sec1;
		department[4] = sec2;        //0	1		2	3		4 and has size 5
		DeptEmployee[] department1 = {prf1, prf2, prf3, sec1, sec2}; // option2 putting data in array
				
		Scanner sc = new Scanner(System.in);
		System.out.println(" Do you want to see all salaries? Y/N");
		String answer = sc.next();
		sc.close();
		
		double sum=0;
		if(answer.equalsIgnoreCase("y")){
			for(DeptEmployee dept: department) {
				sum += dept.computeSalary();     //compute sum of salary belong to all workers
			}
				System.out.println("the sum of all workers salary is : " + sum);
		} else {
			System.out.println("Nothing");	
		}
		
		//To display salary of each professor and secretary by using Polymorphism, use below method
		for(DeptEmployee dept: department) {
			System.out.println("Salary of this " + dept.getClass().getSimpleName() + " is " + dept.computeSalary());
		}
		
		for(int i = 0; i < department.length; i++) {  // option 1
		System.out.println(department[i]);          // display each of workers info
		}
		System.out.println("******* option 2 ********");
		for(int i = 0; i < department1.length; i++) {    // optin 2
			System.out.println(department1[i]);          // display each of workers info
			}

	}
}
