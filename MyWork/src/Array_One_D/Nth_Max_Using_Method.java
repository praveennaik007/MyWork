package Array_One_D;

import java.util.Arrays;


public class Nth_Max_Using_Method {
	public static void main(String[] args) {
		int a[] = { 3, 6, 1, 7, 4, 8, 9 };
		int k = 2;
		System.out.println(max(a, k));
	}

	public static int max(int a[], int n) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		return a[a.length - n];
	}

}
