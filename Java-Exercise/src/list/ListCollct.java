package list;

public class ListCollct {

	String[] strArray;
	int size;

	public boolean find(String s) {
		for (String test : strArray) {
			if (test.equals(s)) // if(test == s) return true;
				return true;
		}
		return false;
	}

	public void insert(String s, int pos) {
		if (pos > size)
			return;
		if (pos >= strArray.length || size + 1 > strArray.length) {
			 //resize();
		}
		String[] temp = new String[strArray.length + 1];
		System.arraycopy(strArray, 0, temp, 0, pos);
		temp[pos] = s;

		System.arraycopy(strArray, pos, temp, pos + 1, strArray.length - pos);
		strArray = temp;
		size++;
	}

	
}
