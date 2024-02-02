package recursion;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fib(10));
	}

	public static int fib(int a) {

		if (a <= 1) {
			return a;
		} else {
			return (fib(a - 1) + fib(a - 2));
		}

	}
}
