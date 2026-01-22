package Array_One_D;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Two_Array_ZigZag {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size1 ");
//		int n = sc.nextInt();
//		int a[] = new int[n];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = sc.nextInt();
//		}
//		System.out.println("Enter the size2 ");
//		int x = sc.nextInt();
//		int b[] = new int[x];
//		for (int i = 0; i < b.length; i++) {
//			b[i] = sc.nextInt();
//		}
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9};
		int c[] = new int[a.length + b.length];
		int j = 0, k = 0;
		for (int i = 0; i < c.length;) {
			if (j < a.length) {
				c[i] = a[j];
				i++;
				j++;
			}
			if (k < b.length) {
				c[i] = b[k];
				i++;
				k++;
			}
		}
		System.out.println(Arrays.toString(c));
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
