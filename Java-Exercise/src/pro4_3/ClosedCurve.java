package pro4_3;

public abstract class ClosedCurve implements Polygon{
	
	ClosedCurve(){		
	}
	
	public abstract double computeArea();
	
	public abstract int getNumberOfSides();
	
	public abstract double computePerimeter();
	

}
