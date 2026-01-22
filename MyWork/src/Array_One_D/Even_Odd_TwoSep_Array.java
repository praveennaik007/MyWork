package Array_One_D;

import java.util.Arrays;

public class Even_Odd_TwoSep_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 6, 8, 9, 7, 8, 7, 3 };
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[i] = -1;
				}
			}
		}
		int b[] = new int[a.length - count];
		int l = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[i] = -1;
				}
			}
			if (a[i] != -1) {
				b[l++] = a[i];

			}
		}
		System.out.println(Arrays.toString(b));

		int c = 0, c1 = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {
				c++;
			} else {
				c1++;
			}
		}
		int x[] = new int[c];
		int y[] = new int[c1];
		int j = 0, k = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {
				x[j++] = b[i];
			} else {
				y[k++] = b[i];
			}
		}
		System.out.println("Even : " + Arrays.toString(x));
		System.out.println("Odd : " + Arrays.toString(y));
	}
}
