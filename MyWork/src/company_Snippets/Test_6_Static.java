package company_Snippets;

public class Test_6_Static {
	static {
		System.out.println("One");
	}
	static {
		System.out.println("Two");
	}
	{
		System.out.println("Three");
	}
	{
		System.out.println("Four");
	}

	public Test_6_Static() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		new Test_6_Static();
		new Test_6_Static();
	}
}
