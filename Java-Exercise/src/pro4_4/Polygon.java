package pro4_4;

public interface Polygon {
	//returns in an array all sides of the polygon 
	//example: For a rectangle, return would be [width, width, length, length]
	
	public double[] getArrayOfSides();               // abstract method	
	//Since Java 8, we can have 'default' and 'static' methods in an interface.
	//Since Java 9, we can have private methods in an interface.
	//returns the sum of the values in arr
	static double sum(double[] arr) {                // non abstract method  ....???????
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum  += arr[i];
		}
		return sum;
	}	
	//returns the perimeter of the polygon
	default double computePerimeter() {    // non abstract method after java 8 by using default keyword
		return sum(getArrayOfSides());
	}


}
