package imp_Work;

public class Test {
	static {
		System.out.println("one");
	}
	static {
		System.out.println("two");
	}
	{
		System.out.println("three");
	}
	{
		System.out.println("four");
	}
	public Test() {
		System.out.println("from constrccto");
	}
	public static void main(String[] args) {
		new Test();
		new Test();
	}
}
