package Rough;

public class Harshad_Number {
	public static void main(String[] args) {
		int num = 18, sum = 0, n = num;
		while (num != 0) {
			int d = num % 10;
			sum += d;
			num /= 10;
		}
		if (n % sum == 0) {
			System.out.println("Harshad Number ");
		} else {
			System.out.println("Not Harshad Number ");
		}
	}
}
