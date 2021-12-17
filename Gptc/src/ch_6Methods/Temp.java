package ch_6Methods;

public class Temp {
	
	
	/** Convert from Celsius to Fahrenheit */
	 public static double celsiusToFahrenheit(double celsius) {
	  return (9.0 / 5) * celsius + 32;
	 }
	  
	 /** Convert from Fahrenheit to Celsius */
	 public static double fahrenheitToCelsius(double fahrenheit) {
	  return (5.0 / 9) * (fahrenheit - 32);
	 }
	 
	 
	public static void main(String [] args) {
		
		 System.out.printf("%-15s%-15s|    %-15s%-15s\n","Celsius","Fahrenheit","Fahrenheit","Celsius");// f means format
		  System.out.println( String.format("%62s"," ").replace(' ', '-') );
	
	for (int c = 40, f = 120; c >= 31; c--, f -=10) {
		 System.out.printf("%-15.1f%-15.1f|    %-15.1f%-15.2f\n",(float)c,celsiusToFahrenheit(c),(float)f, fahrenheitToCelsius(f));
	}
	}	 
}
