package inheritance;

public class B extends A{
	static int a = 30;
	int b = 40;

	public static void m1() {
		System.out.println("From M1() of B Class");
	}

	public void m3() {
		System.out.println("From M1()");
	}
}
