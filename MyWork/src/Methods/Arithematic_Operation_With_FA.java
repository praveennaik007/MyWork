package Methods;

public class Arithematic_Operation_With_FA {
	public static void main(String[] args) {
		System.out.println("Hello World");
		add(10, 20);
		sub(20, 10);
		div(10, 5);
		mul(10, 5);
		mod(10, 5);
	}

	public static void add(double a, double b) {

		System.out.println("add " + (a + b));
	}

	public static void sub(double a, double b) {

		System.out.println("sub " + (a - b));
	}

	public static void mul(double a, double b) {

		System.out.println("mul " + (a * b));
	}

	public static void div(double a, double b) {

		System.out.println("div " + (a / b));
	}

	public static void mod(double a, double b) {

		System.out.println("mod " + (a % b));
	}
}
