package Array_One_D;

import java.util.Scanner;

public class Shift_Left {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number ");
//		int n = sc.nextInt();
		int n = 2;
		for (int i = 0; i < n; i++) {
			int last = a[a.length - 1];
			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = last;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
