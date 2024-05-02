package Array_Programs;

import java.util.Scanner;

public class Shifttt_Right {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number ");
//		int n = sc.nextInt();
		int n = 2;
		for (int i = 0; i < n; i++) {
			int first = a[0];
			for (int j = 0; j < a.length -1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = first;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
