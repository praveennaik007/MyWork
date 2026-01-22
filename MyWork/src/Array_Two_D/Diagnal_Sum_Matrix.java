package Array_Two_D;

public class Diagnal_Sum_Matrix {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			sum += a[i][i] + a[i][n - i - 1];
		}
		System.out.println(sum);// 30
	}

}
