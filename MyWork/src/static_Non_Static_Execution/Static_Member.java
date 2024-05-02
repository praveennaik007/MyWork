package static_Non_Static_Execution;

public class Static_Member {
	static double d = run(5);
//	static double a = run(52);

	static {
//		run(10);
//		main(null);
	}

	public static int run(int n) {
//		System.out.println(n);
//		main(null);
		return 45;
	}
	public static void m() {
		main(null);
	}
	public static void main(String[] args) {
		System.out.println(d);
		m();
	}
}
