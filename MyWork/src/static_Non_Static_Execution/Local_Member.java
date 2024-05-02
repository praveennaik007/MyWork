package static_Non_Static_Execution;

public class Local_Member {
//	static int x = 111;
//	int y = 122;

	public static void main(String[] args) {
//		System.out.println(x);
//		Local_Member s = new Local_Member();
//		System.out.println(s.y);
//		System.out.println(s.x);
		int i = 10;
		System.out.println(i);
		{
			System.out.println("Hi");
		}
		class A {
			{
				System.out.println("Main");
			}
			int p = 200;

			public void m1(int n) {
				System.out.println(p);
				System.out.println(n);
			}
		}
		A a = new A();
		a.m1(10);
		System.out.println(a.p);
		class B {
			int m = 345;

			public int m1() {
				int s = 10;
				System.out.println(a.p);
				return 12;
			}

		}
		B b = new B();
		System.out.println(b.m);
		System.out.println(b.m1());
		{
			a.m1(10);
			System.out.println("Enjoy");
		}

	}
}
