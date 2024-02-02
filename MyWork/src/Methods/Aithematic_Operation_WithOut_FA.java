package Methods;

public class Aithematic_Operation_WithOut_FA {
	public static void main(String[] args) {
		System.out.println("Hello World");
		add();
		sub();
		div();
		mul();
		mod();
	}

	public static void add() {
		int a = 10, b = 20;

		System.out.println("add " + (a + b));
	}

	public static void sub() {
		int a = 20, b = 10;
		System.out.println("sub " + (a - b));
	}

	public static void mul() {
		int a = 5, b = 5;
		System.out.println("mul " + (a * b));
	}

	public static void div() {
		int a = 10, b = 5;
		System.out.println("div " + (a / b));
	}

	public static void mod() {
		int a = 10, b = 5;
		System.out.println("mod " + (a % b));
	}
}
