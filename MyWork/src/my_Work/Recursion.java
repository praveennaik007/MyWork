package my_Work;

public class Recursion {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(sum(n));
		System.out.println(prod(n));
		int num = 145;
		int x = strongNum(num);
		if (x == num) {
			System.out.println("Strong number ");
		} else {
			System.out.println("Not Strong number ");
		}
	}

	public static int sum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + sum(n - 1);
		}
	}

	public static int prod(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * prod(n - 1);
		}
	}

	public static int strongNum(int n) {
		if (n <= 9) {// 145
			return n;
		} else {
			int sum = 0;
			while (n != 0) {
				int d = n % 10;
				int fact = 1;
				for (int i = 1; i <= d; i++) {
					fact *= i;
				}
				sum += fact;
				n /= 10;
			}
			return sum;

		}
	}
	

}
