package recursion;

public class Reverse {
	public static void main(String[] args) {
		System.out.println(rev(123));
	}

	public static int rev(int n) {
		// 54321
		if (n <= 9) {
			return n;
		} else {
			int rev = 0;
			int x = n % 10;
			rev = 10 * rev + x;
			n /= 10;
			System.out.print(rev);
			return rev(n);
		}
	}
}
