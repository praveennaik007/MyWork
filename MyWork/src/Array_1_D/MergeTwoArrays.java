package Array_1_D;

import java.util.Arrays;

public class MergeTwoArrays {
		public static void main(String[] args) {
			int a[] = { 2, 4, 6, 7, 4, 15 };
			int b[] = { 3, 5, 8, 1, 9, 13 };
			int c[] = new int[a.length + b.length];
			int j = 0, k = 0;
			for (int i = 0; i < c.length; i++) {
				if (i < a.length) {
					c[i] = a[j++];
				} else {
					c[i] = b[k++];
				}
			}
			System.out.println(Arrays.toString(c));
//			for (int i = 0; i < c.length; i++) {
//				System.out.print(c[i] + " ");
//			}

		}

}
