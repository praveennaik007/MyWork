package my_Work;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		int[] a = { 5, 2, 4, 7, 3 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			for (int i1 : a) {
				System.out.print(i1 + " ");
			}
			System.out.println();
		}

	}

}
