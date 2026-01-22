package Array_One_D;

public class Sum_Of_Even_Mul_Sum_Of_Odd {
	public static void main(String[] args) {
		int a[] = { 2, 5, 1, 4, 7, 9, 5 };
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum1 += a[i];
			} else {
				sum2 += a[i];
			}
		}
		System.out.println(sum1 * sum2);
	}
}
