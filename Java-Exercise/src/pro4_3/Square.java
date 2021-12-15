package pro4_3;

public class Square extends ClosedCurve implements Polygon {

	private final double side;
	private final int NUMBER_OF_SIDES = 4;

	public Square(double side) {
		this.side = side;

	}

	public double computeArea() {
		return side * side;
	}

	public int getNumberOfSides() {
		return NUMBER_OF_SIDES;
	}

	public double computePerimeter() {
		return side + side + side + side;
	}

}
