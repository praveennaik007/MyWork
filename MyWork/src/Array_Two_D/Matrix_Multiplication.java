package Array_Two_D;

public class Matrix_Multiplication {
	public static void main(String[] args) {
		int a[][] = { 
					{ 1, 2, 3 }, 
					{ 4, 5, 6 },
					{ 7, 8, 9 } };
		int b[][] = { 
					{ 9, 8, 7 },
					{ 6, 5, 4 }, 
					{ 3, 2, 1 } };
//		1*1+2*2+3*3=14 4*1+5*2+6*3=32
//		1*4+2*5+3*6=32 
//		1*7+2*8+3*9=50
		int c[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}
