
package pro4_4;

public class Test {
	
	public static void main(String[] args) {

		Polygon[] poly = { new Rectangle(3, 4), new Square(3) };

		for (Polygon p : poly) {   // poly array of polygon 
			
			System.out.println("For this " + p.getClass().getSimpleName() + " \n perimeter is = " + p.computePerimeter()
					+ "\n" + "Thank you for using our program!");
		}
	}
}
