package Methods;

public class Desarium {
	public static void main(String[] args) {
		int num = 135;
		if (desarium(num) == true) {
			System.out.println("Desarium ");
		} else {
			System.out.println("Not Desarium ");
		}
	}

	public static boolean desarium(int num) {
		int res = 0;
		int c = count(num);
		int temp = num;
		while (num != 0) {
			int d = num % 10;
			res = res + pow(d, c);
			c--;
			num /= 10;
		}
		return res == temp;
	}

	public static int count(int num) {
		int count = 0;
		while (num != 0) {
			num /= 10;
			count++;
		}
		return count;
	}

	public static int pow(int m, int n) {
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * m;
		}
		return pow;
	}
}
