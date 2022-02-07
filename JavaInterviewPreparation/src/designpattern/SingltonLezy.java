package designpattern;

public class SingltonLezy {

	private static SingltonLezy INSTANCE;

	private SingltonLezy() {

	}

	public static SingltonLezy getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingltonLezy();
		}
		return INSTANCE;
	}

}
