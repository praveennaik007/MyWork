package number_Program;

public class Con_Decimal_To_Binary {
	public static void main(String[] args) {
		int n = 8;
		String s = "";
		while (n > 0) {
			int d = n % 2;
			s = d + s;
			n /= 2;
		}
		System.out.println(s);
	}
}
