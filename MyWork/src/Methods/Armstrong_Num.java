package Methods;

public class Armstrong_Num {
	public static void main(String[] args) {
		int n = 153;
		if (sum(n) == true) {
			System.out.println("Armstrong Number ");
		} else {
			System.out.println("Not Armstrong Number ");
		}
	}

	public static boolean sum(int n) {
		int sum = 0;
		int temp = n;
		int c = count(n);
		while (n != 0) {
			int d = n % 10;
			sum = sum + pow(d, c);
			n /= 10;
		}
		if (sum == temp)
			return true;
		else
			return false;
	}

	public static int count(int n) {
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	public static int pow(int m, int n) {
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow *= m;
		}
		return pow;
	}
}
