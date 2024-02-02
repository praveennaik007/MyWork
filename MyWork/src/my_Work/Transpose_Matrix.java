package my_Work;

public class Transpose_Matrix {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int [][]d=new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
				d[i][j]=a[i][j];
			}
			System.out.println();
		}
		System.out.println();
//		int b[][]=new int[a[0].length][a[0].length];
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(d[j][i] + " ");
			}
			System.out.println();
		}
	}
}
