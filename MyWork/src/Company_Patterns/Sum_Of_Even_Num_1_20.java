package Company_Patterns;

public class Sum_Of_Even_Num_1_20 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
