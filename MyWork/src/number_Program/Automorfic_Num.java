package number_Program;

import java.util.Scanner;

public class Automorfic_Num {
	public static void main(String[] args) {
		//square the given number and do sum 
		//the result is equal to the number itself 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int sq = num * num;
		boolean rs = true;
		while (num > 0) {
			if (num % 10 == sq % 10) {
				rs = true;
				num /= 10;
				sq /= 10;
			} else {
				rs = false;
				break;
			}
		}
		if (rs == true) {
			System.out.println("Automorfic ");

		} else {
			System.out.println("Not A Automorfic ");
		}
		System.out.println(" ===Another Way === ");
		while (num > 0) {
			if (num % 10 != sq % 10) {
				break;
			}
			num /= 10;
			sq /= 10;
		}
		if (num == 0) {
			System.out.println("Automorfic ");
		} else {
			System.out.println("Not Autmorfic ");
		}
	}
}
