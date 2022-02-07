package designpattern;

//Singleton Eager Initialization
public class Singlton {

	private static final Singlton INSTANCE = new Singlton();

	private Singlton() {

	}

	public static Singlton getInstance() {
		return INSTANCE;
	}
}
