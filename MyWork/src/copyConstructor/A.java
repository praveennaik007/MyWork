package copyConstructor;

public class A {
	int id;
	String name;
	double price;
	public A() {
		System.out.println("Hello");
	}
	public A(int id, String name, double price) {
		this();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public A(A add) {
		this();
		this.id = add.id;
		this.name = add.name;
		this.price = add.price;
	}
}
