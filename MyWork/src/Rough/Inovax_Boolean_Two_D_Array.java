package Rough;

import java.util.Arrays;

public class Inovax_Boolean_Two_D_Array {
	public static void main(String[] args) {
		boolean a[][] = { { false, true, true, true }, 
						{ false, false, true, true }, 
						{ true, true, true, true },
						{ false, false, false, false } };
		int[][] n = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j]) {
					n[i][j] = 1;
				} else {
					n[i][j] = 0;
				}
			}
		}
		int k = 0, max = 0;
		for (int i = 0; i < n.length; i++) {
			int c = 0;
			for (int j = 0; j < n[i].length; j++) {
//				System.out.print(n[i][j]);
				if (n[i][j] == 1) {
					c++;
				}
			}
			if (c > max) {
				max = c;
				k = i + 1;
			}
		}
		System.out.println("Rows " + k + " has Maximum 1s");

	}
}
