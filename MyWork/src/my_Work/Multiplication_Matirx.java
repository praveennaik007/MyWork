package my_Work;

import java.util.Arrays;

public class Multiplication_Matirx {
	public static void main(String[] args) {
		int a[][] = { { 1, 2 }, { 1, 2 } };
		int b[][] = { { 1, 2 }, { 1, 2 } };
		int res[][] = new int[a[0].length][b.length];
		if (a.length == b[0].length) {
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[i].length; j++) {
					for (int k = 0; k < res[j].length; k++) {
						res[i][j] += a[i][k] * a[k][j];
					}
				}

			}
		}
		System.out.println(Arrays.deepToString(res));
//		for (int i = 0; i < res.length; i++) {
//			System.out.println(Arrays.toString(res[i]));
//		}
	}
}
