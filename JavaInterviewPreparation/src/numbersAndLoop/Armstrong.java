package numbersAndLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Armstrong Number in Java Armstrong is one in which the sum of the cubes of the individual digits of the number 
 is equal to the number itself. Armstrong number is a special kind of number where the digits are first picked up, 
 then they are cubed, and finally, all the cubes of the individual digits are added to get a number. 
 If the number thus found is equal to the original number, then the respective number is known as an 
 Armstrong number.
 */
public class Armstrong {
	
	public static void main(String[] args)throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a number");
	int num = Integer.parseInt(br.readLine());
	int number, digit, sum = 0;
	number = num;
	while (number != 0) {
	digit = number % 10;
	sum = sum + digit*digit*digit;
	number /= 10;
	}
	if(sum == num)
	System.out.println(num + " is an Armstrong number");
	else
	System.out.println(num + " is not an Armstrong number");
	}

}
