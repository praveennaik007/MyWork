package Rough;

public class P1 {

	static int i = 10;
	int j = 20;
	{
		System.out.println("Bhaskar");
	}
	public static void m2() {
		System.out.println("Above To End");
	}
	public void m1() {
		System.out.println("End");
	}
	static {
		System.out.println("J Spider");
	}
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		P1 obj=new P1();
		System.out.println(P1.i);
		System.out.println(obj.j);
//		m2();
		P1.m2();
//		obj.m2();
		obj.m1();
	}
	{
		System.out.println("Bye");
	}
	static {
		System.out.println("asdf");
	}
}
