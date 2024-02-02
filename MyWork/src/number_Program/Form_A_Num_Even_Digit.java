package number_Program;

public class Form_A_Num_Even_Digit {
	public static void main(String[] args) {
		int num = 546832;
		int rev = 0;
		while (num != 0) {
			int d = num % 10;
			if (d % 2 == 0) {
				rev = 10 * rev + d;
			}
			num /= 10;
		}
		int reverse = 0;
		while (rev != 0) {
			int n = rev % 10;
			reverse = 10 * reverse + n;
			rev /= 10;
		}
		System.out.println(reverse);
	}
}
