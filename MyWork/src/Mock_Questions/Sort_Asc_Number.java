package Mock_Questions;

public class Sort_Asc_Number {
	public static void main(String[] args) {
		int n = 25431768;
		int rev = 0;
		for (int i = 1; i <= 9; i++) {
			int temp = n;
			while (temp != 0) {
				int d = temp % 10;
				if (i == d) {
					rev = rev * 10 + d;
				}
				temp /= 10;
			}
		}
		System.out.println(rev);
	}
}
