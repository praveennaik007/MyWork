package Array_Programs;

import java.util.Arrays;

public class Type_Of_ZigZag_First_Last_First_Last {
	public static void main(String[] args) {
		int a[] = { 1, 6, 7, 20, 40, 60 };
		int first = 0;
		int last = a.length - 1;
		int x = 0;
		int n[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				n[x++] = a[first++];
			} else {
				n[x++] = a[last--];
			}
		}
		System.out.println(Arrays.toString(n));
	}
}
