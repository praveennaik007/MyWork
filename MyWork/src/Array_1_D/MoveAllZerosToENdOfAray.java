package Array_1_D;

import java.util.Arrays;

public class MoveAllZerosToENdOfAray {
	public static void main(String[] args) {
		int a[] = { 23, 2, 0, 4, 0, 45, 3, 0, 5, 6 };

		zero(a);
	}

	public static void zero(int[] a) {
		int b[] = new int[a.length];
		int j = 0;
		int n = b.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				b[j++] = a[i];
			}
//				else {
//				b[n--] = a[i];
//			}
		}
		System.out.println(Arrays.toString(b));
	}
}
