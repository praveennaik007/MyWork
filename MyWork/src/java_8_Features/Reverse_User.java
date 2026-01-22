package java_8_Features;

public class Reverse_User {
	public static void main(String[] args) {
		Reverse_Using_Lambda r;
		r = (n) -> {
			int rev = 0;
			while (n > 0) {
				int d = n % 10;
				rev = rev * 10 + d;
				n = n / 10;
			}
			System.out.println(rev);
		};
		r.rev(123);

	}
}
