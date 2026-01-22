package Lambda_Expression;

public class WithoutLambdaExpMain {
	public static void main(String[] args) {
		WithoutLambdaExp exp = new WithoutLambdaExp() {

			@Override
			public void read(int n) {
				int rev = 0;
				while (n > 0) {
					int d = n % 10;
					rev = rev * 10 + d;
					n /= 10;
				}
				System.out.println("Reading...!!! " + rev);
			}
		};
		exp.read(123);
	}
}
