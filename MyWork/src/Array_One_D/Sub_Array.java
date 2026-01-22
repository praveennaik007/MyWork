package Array_One_D;

public class Sub_Array {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 3, 4 };

		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[j]) {
				j++;
				if (j == b.length) {
					break;
				}
			} else {
				j = 0;
			}
		}
		if (j == b.length) {
			System.out.println("contains");
		} else {
			System.out.println("not");
		}
	}
}
