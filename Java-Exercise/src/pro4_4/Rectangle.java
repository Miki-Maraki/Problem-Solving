package pro4_4;

public final class Rectangle implements Polygon {
	private double length;
	private double width;
	private final int NUMBER_OF_SIDES = 4;
	private double[] sideArray = new double[NUMBER_OF_SIDES];
	
	Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	public double[] getArrayOfSides() {
		for (int i = 0; i < NUMBER_OF_SIDES; i++) {
			if (i < 2)
				sideArray[i] = width;
			else
				sideArray[i] = length;
		}
		return sideArray;
	}

}
