
package pro4_3;

public class Test {
	public static void main(String[] args) {

		Polygon[] objects = { new Triangle(4, 5, 6), new Square(3), new Rectangle(3, 4) };

		// compute number of sides and areas, display result
		for (Polygon p : objects) {
			
			//System.out.println(p.getNumberOfSides());
			System.out.println("Number of this " + p.getClass().getSimpleName() + " is " + p.getNumberOfSides());
			
			//System.out.println(p.computePerimeter());
			System.out.println("The Area of this " + p.getClass().getSimpleName() + " is " + p.computePerimeter() + "\n");
		}

	}

}
