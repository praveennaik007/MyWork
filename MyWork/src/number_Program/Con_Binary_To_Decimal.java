package number_Program;

public class Con_Binary_To_Decimal {
	public static void main(String[] args) {
		int n = 1001, dec = 0, pow = 1;
		while (n > 0) {
			int d = n % 10;
			dec = dec + d * pow;
			pow = pow * 2;
			n /= 10;
		}
		System.out.println(dec);
	}
}
