package pro4_2;

import java.util.Arrays;

public class Triangle extends ClosedCurve {
	private final double base;
	private final double height;
	private final double side1;
	private final double side2;
	private final double side3;
	private static final double DEFAULT_SIDE = 5.0;
	private final int NUMBER_OF_SIDES = 3;
	
	public Triangle(double base, double height){  // parameterized constructor 1
		if (height <= base) {
			this.base = base;
			this.height = height;
		} 
		else {
			this.base = height;
			this.height = base;
		}
		side1 = height;
		side2 = base;
		side3 = Math.sqrt(base * base + height * height);	
	}
	
	public Triangle(double s1, double s2, double s3)  { // parameterized constructor 2
		double[] arr = {s1, s2, s3};
		Arrays.sort(arr);		
		double x = arr[0];
		double y = arr[1];
		double z = arr[2];
		if(x + y < z) {
			//TODO: Throw an exception here...
			System.out.println("Illegal sizes for a triangle: " + s1 + ", " + s2+", " + s3);
			System.out.println("Creating an equilateral triangle with side = " + DEFAULT_SIDE);
			x = y = z = DEFAULT_SIDE;
		}
		side1 = x;
		side2 = y;
		side3 = z;
		double u = (y * y - x * x + z * z)/(2 * z);
		double h = Math.sqrt(y * y - u * u);
		base = z;
		height = h;	

	}
	public double computeArea() {
		return (0.5 * base * height);
	}
	public int getNumberOfSides() {
		return NUMBER_OF_SIDES;
	}
	public double computePerimeter() {
		return side1 + side2 + side3;
	}

}
