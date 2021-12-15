package pro4_2;

public class Test {
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(5,6),
								 new Square(3),
								 new Circle(3),
								 new Rectangle(5,7)};
		//compute areas
		for(ClosedCurve cc : objects) {
			
			//System.out.println(cc.computeArea());
			System.out.println("The Area of this " + cc.getClass().getSimpleName() + " is " + cc.computeArea());
		}
			
	}

}
