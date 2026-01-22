package Array_One_D;

import java.util.Arrays;

public class Swap_An_Array_WithOut_Another_Array {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70 };
		int i = 0;
		int n = a.length - 1;
		while (i < n) {
			int temp = a[i];
			a[i] = a[n];
			a[n] = temp;
			n--;
			i++;
		}
		System.out.println(Arrays.toString(a));

	}
}
