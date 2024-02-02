package Mock_Questions;

public class Prime_Position {
	public static void main(String[] args) {
		int n = 5386124;// 3814
		int temp = n;
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		int rev = 0;
		while (temp != 0) {
			int d = temp % 10;
			rev = 10 * rev + d;
			temp /= 10;
		}
		for (int i = 1; i <= count; i++) {
			int rem = rev % 10;
			int c = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.print(rem);
			}
			rev /= 10;
		}
	}
}
