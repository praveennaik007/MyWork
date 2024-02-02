package my_Work;

public class Butterfly_Pattern {
	public static void main(String[] args) {
		int row = 5;
		int col = row;
		int f = 1;
		int l = row;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (j > f && j < l) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			if (i <= row / 2) {
				f++;
				l--;
			} else {
				f--;
				l++;
			}
			System.out.println();
		}
	}
}
