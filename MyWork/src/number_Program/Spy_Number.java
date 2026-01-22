package number_Program;

import java.util.Scanner;

public class Spy_Number {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number ");
//		int num = sc.nextInt();
		int num = 12;
		int sum = 0;
		int prod = 1;

		while (num > 0) {
			int d = num % 10;
			sum = sum + d;
			prod = prod * d;
			num = num / 10;
		}
		if (sum == prod) {
			System.out.println("Spy Number ");
		} else {
			System.out.println("Not A Spy Number ");
		}
	}

}
