package number_Program;

public class Sort_Number_Asscending {
	public static void main(String[] args) {
		int n = 437631874;
		int rev = 0;
		for (int i = 1; i <= 9; i++) {
			int temp = n;
			while (temp > 0) {
				int d = temp % 10;
				if (i == d) {
					rev = 10 * rev + d;
				}
				temp /= 10;
			}
		}
		System.out.print(rev);
	}
}
