package Rough;

public class Gcd_Array {
	public static void main(String[] args) {
		int a[] = { 12, 4, 1, 3, 4, 5, 6 };
		System.out.println(fGcd(a));
	}

	public static int fGcd(int a[]) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			temp = gcd(temp, a);
		}
		return temp;
	}

	public static int gcd(int a, int a2) {
		int gcd = 0;
		for (int i = 1; i <= a && i <= a2; i++) {
			if (a % i == 0 && a2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
}
