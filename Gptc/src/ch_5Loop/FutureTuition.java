package ch_5Loop;

public class FutureTuition {
/*	Problem: Suppose that the tuition for a university is $10,000 this year and 
             tuition increases 7% every year. In how many years will the tuition be doubled?
*/
	public static void main(String[] args) { 
		
	    double tuition = 10000;   // Year 0
	    int year = 0;
	    while (tuition < 20000) {      // tuition  10000 	10700	11449	1225	13108 .....21048
	      tuition = tuition * 1.07;    //  year     0		1		2		3		4	 ...	11
	      year++;                      // after 11 year execution will stop bc tuition is > 20000
	    }
	  
	    System.out.println("Tuition will be doubled in " + year + " years");
	    // -----> Tuition will be doubled in 11 years
	    
	    System.out.printf("Tuition will be $%.2f in %1d years",  tuition, year);//$%.2f = $21048, %1d = 11
	    //  ---> Tuition will be $21048 in 11 years
	  
	    int sum = 0;
	    int number = 0;
	    while (number < 20) {
	      number++;
	      sum += number;
	      if (sum >= 100) 
	        break;
	    }
	    System.out.println("The number is " + number);
	    System.out.println("The sum is " + sum);
	    
	    int summ = 0;
	    int numberr = 0;
	    while (numberr < 20) {
	      numberr++;
	      if (numberr == 10 || numberr == 11) 
	        continue;
	      summ += numberr;
	    }
	    System.out.println("The summ is " + summ);
	
	}

}

