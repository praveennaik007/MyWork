package Rough;

public class Simple_Prog {
	static int x = 111;
	int y = 122;

	public static void main(String[] args) {
//	int a=10;int b=20;int c=30;
//	int d=a++ || ++b ||c++;
//	System.out.println(d);
		System.out.println(x);
		Simple_Prog s = new Simple_Prog();
		System.out.println(s.y);
		System.out.println(s.x);
		int k = 110;
		System.out.println(k);
		class A {
			int i = 200;

			public void m1(int n) {
				System.out.println(i);
				System.out.println(n);
			}
		}
		A a = new A();
		a.m1(10);
		System.out.println(a.i);
		{
			System.out.println("Hello");
		}
		{
			System.out.println("Hi");
		}
		class B {
			int m = 345;

			public int display() {
				return 12;
			}
		}
		{
			System.out.println("Hmm");
		}
		B b = new B();
		System.out.println(b.m);
		System.out.println(b.display());
		{
			System.out.println("Enjoy");
		}
		{
			k = 30;
			int j = 20;
			System.out.println(j);
		}
	}
}
