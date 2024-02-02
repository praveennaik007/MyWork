package constructors;

public class B extends A {
	int k;
	int l;

	public B(int k, int l) {
		super(10, 20,30);
		super.i = i;
		super.j = j;
		this.k = k;
		this.l = l;
		super.run();
	}

	public void display() {
		super.run();
		System.out.println(super.i);
		System.out.println(super.j);
		System.out.println(this.k);
		System.out.println(this.l);
	}

	public static void main(String[] args) {
		B b = new B(12, 23);
		b.display();
		System.out.println("*************");
		System.out.println(b.i);
		System.out.println(b.j);
		System.out.println(b.k);
		System.out.println(b.l);
	}
}
