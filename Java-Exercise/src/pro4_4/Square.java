
package pro4_4;

public final class Square implements Polygon {
	private final double side;
	private final int NUMBER_OF_SIDES = 4;
	private double[] sideArray = new double[NUMBER_OF_SIDES];
	
	public Square(double side) {
		this.side = side;
	}
	
	
	public double[] getArrayOfSides() {
		for (int i = 0; i < NUMBER_OF_SIDES; i++){
			 sideArray[i] = side;
		}
		return sideArray;
	}

}
