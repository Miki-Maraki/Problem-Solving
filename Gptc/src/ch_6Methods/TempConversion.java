package ch_6Methods;

public class TempConversion {
	
	/* Convert from Celsius to Fahrenheit*/ 
	public static double celsiusToFahrenheit(double celsius) { 
	double fahrenheit = (9.0 / 5) * celsius + 32;
	return fahrenheit;
	}
	
	
	/* Convert from Fahrenheit to Celsius */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Celsius\t\t Fahrenheit\t | \t\tFahrenheit \tCeslius");
		System.out.println("Celsius\t\t Fahrenheit\t | \t\tFahrenheit \tCeslius");
		
		double celsius = 40;
		double fahrenheit = 120;		
		for (int i = 1; i <= 10; celsius--, fahrenheit -=10, i++) {
			System.out.println(celsius + "\t\t" + celsiusToFahrenheit(celsius) + "\t | \t" + fahrenheit + "\t\t" + fahrenheitToCelsius(fahrenheit));
			System.out.printf(" %7.2f %15.2f \t | \t %15.2f %12.2F ", celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
			
		} // end of for loop
	}  // end of main method


}
