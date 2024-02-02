package Array_Programs;

import java.util.Scanner;

public class Array_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int i = 0;
		for (i = 0; i < a.length; i++) {
			int rev = 0;
			int n = a[i];
			int temp = n;
			while (n > 0) {
				int d = n % 10;
				rev = rev * 10 + d;
				n /= 10;
			}
//			System.out.println(rev);
			if (temp == rev) {
				System.out.println(a[i] + " Palindrome ");
			} else {
				System.out.println(a[i] + " not a palindrome ");
			}
		}
	}
}
