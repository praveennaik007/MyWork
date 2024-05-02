package static_Non_Static_Execution;

public class P2 {
	static int i = 10;

	public static void run(int i) {
		System.out.println(i);
		P2.i = i;
	}

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(P2.i);
		char ch = '1';
		run(ch);
	}
}
