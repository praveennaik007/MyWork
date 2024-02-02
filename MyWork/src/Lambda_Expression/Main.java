package Lambda_Expression;

public class Main {
	public static void main(String[] args) {

		Reverse rever = (rev) -> {
			int reverse = 0;
			while (rev > 0) {
				int rem = rev % 10;
				reverse = 10 * reverse + rem;
				rev /= 10;
			}
			return reverse;
		};
		System.out.println(rever.rev(123));
	}
}
