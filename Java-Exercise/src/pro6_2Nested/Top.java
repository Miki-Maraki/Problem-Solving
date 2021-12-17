package pro6_2Nested;

public class Top {       // Top outer class
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	
	Top() {    // default constructor
		mid = new Middle();          // Middle mid = new Middle();
		midbot = mid.new Bottom();   // House.Bedroom bd = hs.new Bedroom();
		                             // Middle.Bottom midbot = mid.new Bottom();
	}

	// returns the value in the instance variable of Bottom
	public int readBottom() {
		// implement
		// return 0;
		return midbot.b;
	}

	class Middle { // middle inner class
		int m = 2;

		// returns sum of instance variable in Top and instance variable in Bottom
		public int addTopAndBottom() {
			// implement
			// return 0;
			return t + midbot.b; // or t + readBottom()
		}

		class Bottom { // bottom inner inner class
			int b = 3;

			// returns the product of the instance variables in all three classes
			public int multiplyAllThree() {
				// implement
				// return 0;
				return t * m * b;
			}
		}
	}

	public static void main(String[] args) {
		Top top = new Top();
		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());
	}

}
