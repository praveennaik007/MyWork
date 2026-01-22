package Rough;

public class Inovax_Two_D_Array {
	public static void main(String[] args) {
		int a[][] = { { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 } };
		int max = 0;
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			int c = 0;
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 1) {
					c++;
				}
			}
			if (c > max) {
				max = c;
				k = i + 1;
			}

		}
		System.out.println("Row " + k + " has a maximum 1s");
	}
}
