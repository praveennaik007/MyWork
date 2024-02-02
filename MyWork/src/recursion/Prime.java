package recursion;

public class Prime {
	static int i = 2;

	public static void main(String[] args) {

		if (isPrime(7)) {
			System.out.println("Prime Number ");
		} else {
			System.out.println("Not Prime Number ");
		}
	}

	public static boolean isPrime(int n) {
		if (n == 1)
			return false;
		if (i == n / 2 + 1)
			return true;

		if (n % i == 0) {
			return false;
		}
		i++;
		return isPrime(n);
	}
}
