package Array_Programs;

import java.util.Arrays;

public class Sort_Sellection {
	public static void main(String[] args) {
		int a[] = { 3, 4, 1, 2, 6 };
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		System.out.println(Arrays.toString(a));
//	for (int i = 0; i < a.length; i++) {
//		System.out.println(a[i]);
//	}
	}
}
