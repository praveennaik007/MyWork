package Rough;

public class Remove_Duplicates_In_An_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 1, 2, 8, 8, 13, 13, 34, 55, 89, 89 };
		duplicate(a);
	}

	public static void duplicate(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {

					a[j] = -1;
				}
			}
			if (a[i] != -1 && fib(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static boolean prime(int a) {
		int count = 0;
		for (int i = 1; i <= a; i++) {

			if (a % i == 0) {
				count++;
			}
		}
		return (count == 2);
	}

	public static boolean fib(int n) {
		int a = 0, b = 1, res = 0;
		while (res <= n) {
			if (res == n) {
				if (prime(res)) {
					return true;
				}
			}
			res = a + b;
			a = b;
			b = res;
		}
		return false;
	}
}
