package Rough;

import java.util.Arrays;

public class Nth_Max_OneOf_Way {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int n = a.length;
		int k = 2;
		System.out.println(d(a, n, k));
	}

	public static int d(int arrayList[], int n, int k) {
		for (int i = 0; i < arrayList.length; i++) {
			for (int j = 0; j < arrayList.length - 1; j++) {
				if (arrayList[j] > arrayList[j + 1]) {
					int temp = arrayList[j];
					arrayList[j] = arrayList[j + 1];
					arrayList[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arrayList));

		return arrayList[n - k];
	}
}
