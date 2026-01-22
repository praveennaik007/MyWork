package Array_One_D;

public class Longest_Increasing_SubSequence {
	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 4, 5, 6, 7, 12, 9, 5, 7, 8, 12 };
		int c = 0, f = -1, l = -1;
		for (int i = 0; i < a.length; i++) {
			int c1 = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					c1++;
					if (c < c1) {
						c = c1;
						f = j - c;
					}
				} else {
					l = j;
					c1 = 0;
				}
				i = j;
			}
		}
		System.out.print("[ ");
		for (int i = f; i < l; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ]");
	}
}
