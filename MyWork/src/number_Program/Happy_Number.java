package number_Program;

public class Happy_Number {
	public static void main(String[] args) {
		int n = 13;
		while (n > 9) {
			int sum = 0;
			while (n > 0) {
				int d = n % 10;
				sum = sum + d * d;
				n = n / 10;
			}
			n = sum;
		}
		if (n == 1 || n == 7) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not A Happy Number");
		}
	}
}
