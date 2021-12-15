package pro4_3;

public class Rectangle extends ClosedCurve implements Polygon{
	private double length;
	private double width;
	private final int NUMBER_OF_SIDES = 4;
	
	Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	public double computeArea() {
	return width * length;
	}
	
	public int getNumberOfSides() {
		return NUMBER_OF_SIDES;
	}
	public double computePerimeter() {
		return 2*(length + width);
	}

}
