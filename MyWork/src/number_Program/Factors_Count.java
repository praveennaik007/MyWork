package number_Program;

public class Factors_Count {
	public static void main(String[] args) {
		int n = 6, c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		System.out.println(c);
	}
}
