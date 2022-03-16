package designpattern;

//Singleton Lezy Initialization
public class SingltonLezy {

	private static SingltonLezy INSTANCE;

	private SingltonLezy() {  // Constructor
	}

	public static SingltonLezy getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingltonLezy();
		}
		return INSTANCE;
	}

}
