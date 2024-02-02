package Rough;

public class Ass {
	public static void main(String[] args) {
		long n = 8976543123456l;
		long rev = 0;
		for (int i = 1; i <= 9; i++) {
			long temp = n;
			while (temp != 0) {
				long d = temp % 10;
				if (i == d) {
					rev = rev * 10 + d;
				}
				temp = temp / 10;
			}

		}
		System.out.println(rev);
	}
}
