package my_Work;

public class Pattern_num {
	public static void main(String[] args) {
		int n = 3;

		for (int r = 1; r <= n; r++) {
			int a = 1;
			for (int c = 1; c <= n; c++) {
				if (r + c >= n + 1) {
					System.out.print(a);
				}else {
					System.out.print(" ");
				}
				a = a + c;
			}

			System.out.println();
		}
	}
}
