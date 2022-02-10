package arrayAndList;

public class ProductArrayMethod {

	public int findProduct(int arr[]) {
		int multi = 1;
		for (int i = 0; i < arr.length; i++) {
			multi = multi * arr[i];
		}
		return multi;
	}

	public static void main(String[] args) {

		ProductArrayMethod p = new ProductArrayMethod();

		System.out.println("product of array is : " + p.findProduct(new int[] { 3, 6, 2, 7 }));
	}
}