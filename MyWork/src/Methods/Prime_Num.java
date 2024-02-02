package Methods;

public class Prime_Num {
	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 4, 5, 13 };
		for (int i = 0; i < n.length; i++) {
			if (prime(n[i]) == true) {
				System.out.println(n[i]);
			}
		}
	}

	public static boolean prime(int n) {
		int a = 0, b = 1, res = 0;
		while (res <= n) {
			if (res == n) {
				return true;
			}
			res = a + b;
			a = b;
			b = res;
		}
		return false;
	}
}
