package pro4_2;

public class HouseTest {
	public static void main(String[] args) {
		 // creating object of outer class House
       House house = new House();

       // creating object of inner class Bedroom
       House.Bedroom bd = house.new Bedroom();

       // creating object of inner class Bathroom
       House.Bathroom bt = house.new Bathroom();

       bd.printBedroom();
       bt.printBathroom();
   }

}
