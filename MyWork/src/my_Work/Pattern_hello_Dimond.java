package my_Work;

public class Pattern_hello_Dimond {
	public static void main(String[] args) {
		int row = 5;
		int col = row;
		int m = row / 2 + 1;
		int a = m;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (j == m || j == a) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if (i <= row / 2) {
				m++;
				a--;
			} else {
				m--;
				a++;
			}
			System.out.println();
		}
	}
}
