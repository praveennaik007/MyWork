package Manasa_Mam;

import java.util.Arrays;

public class Remove_Duplicates_Of_An_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 2, 1 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && a[i] != -1) {
					count++;
					a[j] = -1;
				}
			}
		}
		int k = 0;
		int b[] = new int[a.length-count];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != -1) {
				b[k++] = a[i];
//		System.out.println(a[i]);
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
