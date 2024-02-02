package Array_Programs;

import java.util.Scanner;

public class Array_Highest_sum_of_two_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum1 = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int sum = a[i] + a[j];
				x = a[i];
				y = a[j];
				if (sum > sum1) {

					sum1 = sum;
					// System.out.println(sum1);
				}

			}
		}
		System.out.println(x + " + " + y + " = " + sum1);
	}
}
