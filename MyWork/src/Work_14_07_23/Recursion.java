package Work_14_07_23;

public class Recursion {
	public static void main(String[] args) {
		System.out.println("MB");
		test(4);
		System.out.println("ME");
	}

	public static void test(int n) {

		System.out.println(n);
		n--;
		if (n > 0) {
			test(n);
		}
		System.out.println(n);
	}
}
