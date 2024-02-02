package number_Program;

import java.util.Scanner;

public class Sunny_Number {
	public static void main(String[] args) {
		// the number next to the given number is perfect Square
		// if the number is sunny+1 is perfect Square
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int sq = n + 1;
		boolean rs = false;
		for (int i = 1; i < sq; i++) {
			if (i * i == sq) {
				rs = true;
				break;

			} else {
				rs = false;
			}
		}
		if (rs == true) {
			System.out.println("Sunny number ");
		} else {
			System.out.println("Not Sunny number ");
		}
	}
}
