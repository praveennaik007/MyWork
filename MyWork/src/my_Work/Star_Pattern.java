package my_Work;

public class Star_Pattern {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i < 2 * n; i++) {
			for (int j = 1; j < 2 * n; j++) {
				if (j <= i && i <= n || i <= j && j >= n && i >= n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
