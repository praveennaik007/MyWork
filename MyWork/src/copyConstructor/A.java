package copyConstructor;

public class A {
	int id;
	String name;
	double price;

	public A(int id, String name, double price) {

		this.id = id;
		this.name = name;
		this.price = price;
	}

	public A(A add) {

 		this.id = add.id;
		this.name = add.name;
		this.price = add.price;
	}
}
