package Array_Two_D;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Multiplication_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int b[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
//	1*1+2*2+3*3=14 4*1+5*2+6*3=32
//	1*4+2*5+3*6=32 
//	1*7+2*8+3*9=50
		System.out.println("Enter the row1 : ");
		int row1 = sc.nextInt();
		System.out.println("Enter the col1 : ");
		int col1 = sc.nextInt();
		int a[][] = new int[row1][col1];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the row2 : ");
		int row2 = sc.nextInt();
		System.out.println("Enter the col2 : ");
		int col2 = sc.nextInt();
		int b[][] = new int[row2][col2];

		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.deepToString(b));

		int c[][] = new int[row1][col2];
		for (int i = 0; i < row1; i++) {
//			int sum = 0;
			for (int j = 0; j < col1; j++) {
				for (int k = 0; k < col2; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}

		}
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}
