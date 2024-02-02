package Mock_Questions;

import java.util.Scanner;

public class Nth_Prime_Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int a = 0, b = 1, res = 0;

		while (res <= n) {
			res = a + b;
			a = b;
			b = res;
			if (res == n) {
				if (prime(res)) {

					System.out.println(res);
				}
			}
		}

	}

	private static boolean prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return (count == 2);
	}

}
