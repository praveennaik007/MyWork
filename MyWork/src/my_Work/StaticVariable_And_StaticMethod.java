package my_Work;

public class StaticVariable_And_StaticMethod {
	static int a = 50;
	static {
		System.out.println("hello world ");
	}

	public void m1() {
		System.out.println("hello");
	}

	public static void main(String[] args) {

		StaticVariable_And_StaticMethod s = new StaticVariable_And_StaticMethod();
		System.out.println("hi");
		s.m1();
		System.out.println(a);
		System.out.println(StaticVariable_And_StaticMethod.a);
		System.out.println(s.a);
	}

}
