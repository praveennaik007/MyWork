package Mock_Questions;

public class Count_Num_POw_Of_Prime_Using_Method {
	public static void main(String[] args) {
		int a = 345621;
		int p = isPrime(a);
		System.out.println(p);
	}

	public static int count(int n) {
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	public static int pow(int base, int pow) {
		int pro = 1;
		for (int i = 1; i <= pow; i++) {
			pro *= base;
		}
		return pro;
	}

	public static int isPrime(int n) {
		int x = count(n);
		int sum = 0;
		int res = 0;
		while (n != 0) {
			int d = n % 10;
			int c = 0;
			int i;
			for (i = 2; i < d; i++) {
				if (d % i == 0) {
					c++;
				}
			}
			if (c == 0 && d != 1) {
				res += pow(d, x);
			}
			n /= 10;
		}
		return res;
	}
}
