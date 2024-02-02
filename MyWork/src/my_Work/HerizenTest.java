package my_Work;

public class HerizenTest {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= i && j <= 2 * n - i) {
					System.out.print(j);
				}
			}
			System.out.println();
		}

		System.out.println("===Gcd===");
		int a1 = 2;
		int b1 = 4;
		int gcd = 0;
		for (int i = 1; i <= a1 && i <= b1; i++) {
			if (a1 % i == 0 && b1 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("Gcd " + gcd);
		System.out.println("===Prime Range===");
		for (int i = 1; i <= 2; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Prime Range " + i);
			}
		}

//		String s1 = "praveen";
//		for (int i = 0;; i++) {
//			System.out.println(s1);
//			return;
//		}
		System.out.println("===Pattern===");
		int n1 = 5;
		for (int i = 1; i <= n1 * 2 - 1; i++) {
			for (int j = 1; j <= n1; j++) {
				if (i + j >= n1 + 1 && j >= i - n1 + 1) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
