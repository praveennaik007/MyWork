package Array_Programs;

import java.util.Arrays;

public class Print_Prime_Ele_In_New_Arr {
	public static void main(String[] args) {
		int a[] = { 12, 13, 53, 5, 17, 7, 29, 39 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (isprime(a[i])) {
				count++;
			}
		}
		int b[] = new int[count];
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			if (isprime(a[i])) {
				b[x++] = a[i];
			}
		}
		System.out.println(Arrays.toString(b));

	}

	public static boolean isprime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				count++;
			}
		}
		return count == 2;

	}
}
