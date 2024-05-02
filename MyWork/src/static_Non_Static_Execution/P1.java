package static_Non_Static_Execution;

public class P1 {
	static double d = P1.run();

	public static int run() {
		System.out.println("Hi");
		return 34;
	}

	public static void main(String[] args) {
		System.out.println(P1.d);
	}
}
