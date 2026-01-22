package Array_One_D;

import java.util.Arrays;

public class Right_Shift_Amiti {
	public static void main(String[] args) {
		int ar[] = { 8, 58, 71, 18, 31, 32, 63, 92, 43, 91, 93, 25, 80, 28 };

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
		System.out.println();
		int last = ar[ar.length - 1];
		for (int i = ar.length - 1; i > 0; i--) {
			ar[i] = ar[i - 1];
			if (i > ar[i]) {
				i = -1;
			}
		}
		ar[0] = last;
		System.out.println(Arrays.toString(ar));

	}
}
