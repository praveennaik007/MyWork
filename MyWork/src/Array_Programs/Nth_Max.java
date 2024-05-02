package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Nth_Max {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size=scanner.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the index : "+i);
			a[i]=scanner.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Enter the nth max number : ");
		int n=scanner.nextInt();
//		int a[] = { 1, 4, 3, 8, 5, 2, 7 };
//		int x=a.length;
//		int n=3;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Nth Max : "+a[a.length-n]);
		
	}
}
