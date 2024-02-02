package Mock_Questions;

public class Prime_Fibonacci_Array {
	public static void main(String[] args) {
		int a[] = { 3, 2, 13, 4, 6, 8, 5, 9, 14, 17, 19, 28 };
		int b[] = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			if (prime(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static boolean fib(int a) {
		int x = 0, y = 1, z = 0;
		while (z <= a) {
			if (z == a) {
				if (prime(z)) {
					return true;
				}
			}
			z = x + y;
			x = y;
			y = z;
		}
		return false;
	}

	public static boolean prime(int a) {
		int c = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				c++;
			}
		}
		return (c == 2);
	}
}
