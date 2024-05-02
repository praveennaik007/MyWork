package Company_Patterns;

public class Tcs_2 {
	public static void main(String[] args) {
		int a[] = { 5, -1, 4, 1, 3, 6, 7, 1 };
		int target_sum = 8;
		int count = 0;
		int sum = 0;
		int sI = 0;
		int eI = 3;
		for (int k = sI; k < eI; k++) {
			sum += a[k];
		}
		if (sum == target_sum) {
			count++;
		}
		System.out.println(count);
	}
}
