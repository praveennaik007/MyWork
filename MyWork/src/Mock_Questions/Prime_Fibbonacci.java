package Mock_Questions;

public class Prime_Fibbonacci {
	public static void main(String[] args) {
		int count = 0;
		int a = 5;
		int b = 6;
		while (count < 5) {
			if (prime(a)) {
				System.out.println(a + " ");
				count++;
			}
			int c = a + b;
			a = b;
			b = c;
		}
	}

	public static boolean prime(int n) {

		int count = 0;
		for (int j = 1; j <= n; j++) {
			if (n % j == 0) {
				count++;
			}
		}
		return (count == 2);
	}
}
