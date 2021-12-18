package pro6_2NestedInner;

public class House {
	
	
	public class Bedroom {    // nested class

        int bedroom_count = 4;

      public  void printBedroom() {
            System.out.println("Number of bedrooms: " + bedroom_count);
        }
    }
 
    protected class Bathroom {  // nested class

        int bathroom_count = 2;

        void printBathroom() {
            System.out.println("Number of bathrooms: " + bathroom_count);
        }
    }

}
