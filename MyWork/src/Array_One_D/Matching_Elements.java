package Array_One_D;

public class Matching_Elements {
	public static void main(String[] args) {
		int a[] = { 1, -3, 5, 9, -3, 9, 0 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}
}
