package recursion;

public class Demo {
	public static void main(String[] args) {
		m1(5);
	}

	public static void m1(int n) {
		System.out.println("Hi");
		m1(n - 1);

	}
}
