package number_Program;

import java.util.Scanner;

public class Neon_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int sq = num * num;
		int sum = 0;
		while (sq > 0) {
			int d = sq % 10;
			sum = sum + d;
			sq = sq / 10;
		}
		if (sum == num) {
			System.out.println("Neon number");
		} else
			System.out.println("not neon");
	}
}
