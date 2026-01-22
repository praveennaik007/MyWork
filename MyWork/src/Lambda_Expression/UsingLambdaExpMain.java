package Lambda_Expression;

public class UsingLambdaExpMain {
	public static void main(String[] args) {
		UsingLambdaExp exp = (n) -> {
			int rev = 0;
			while (n > 0) {
				int d = n % 10;
				rev = rev * 10 + d;
				n /= 10;
			}
//			System.out.println("Reading...!!! " + rev);
			return rev;
		};
		System.out.println(exp.read(123));
	}
}
