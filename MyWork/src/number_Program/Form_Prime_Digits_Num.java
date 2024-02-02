package number_Program;

public class Form_Prime_Digits_Num {
	public static void main(String[] args) {
		int num = 54321;
		int res = 0, p = 1;
		while (num != 0) {
			int d = num % 10;
			if (prime(d)) {
				res = d * p + res;
				p = p * 10;
			}
			num /= 10;
		}
		System.out.println(res);
	}

	public static boolean prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return (count == 2);
	}
}
