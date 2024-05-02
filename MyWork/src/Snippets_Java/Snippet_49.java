package Snippets_Java;

import java.util.Scanner;

public class Snippet_49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		int min = (a + b - Math.abs(a*b)) / 2;
		int max = (a + b - Math.abs(a - b)) / 2;
		System.out.println("The minimum number is " + min);
		System.out.println("The Maximum number is " + max);
	}
}
