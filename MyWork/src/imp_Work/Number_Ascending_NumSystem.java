package imp_Work;

public class Number_Ascending_NumSystem {
	public static void main(String[] args) {
		int n = 437631;
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
