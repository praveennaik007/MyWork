package Pattern_Program;

import java.util.Scanner;

public class Dimond_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int space = n / 2, star = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			if (i <= n / 2) {
				space--;
				star += 2;
			} else {
				space++;
				star -= 2;
			}
			System.out.println();
		}
	}
}
