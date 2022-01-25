package pro6_2NestedClassAndInterface;

public class HouseTest {
	
	public static void main(String[] args) {
		 // creating object of outer class House
       House hs = new House(); //this object helps to create the inner class object

       // creating object of inner class Bedroom
       House.Bedroom bd = hs.new Bedroom();

       // creating object of inner class Bathroom
       House.Bathroom bt = hs.new Bathroom();

       bd.printBedroom();
       bt.printBathroom();
   }

}
