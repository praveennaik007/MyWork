package imp_Work;

public class Rev_Lambda {
	public static void main(String[] args) {

		Rev_M_Lambda r = (n) -> {
			int rev = 0;
			while (n > 0) {
				int d = n % 10;
				rev = rev * 10 + d;
				n /= 10;
			}
			return rev;
		};
		System.out.println(r.rev(123));
	}
}
