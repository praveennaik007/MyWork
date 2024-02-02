package Constructor_Chaining;

public class Car {
	int id;
	String name;
	String color;
	double price;

	public Car(int id) {
//		this(1,"bye","red",56.78);
		this.id=id;
		System.out.println(name);
		System.out.println("From One Args");
	}

	public Car(int id,String name) {
		this(10);
		this.name="hello";
		System.out.println(this.name);
		System.out.println(name);
		System.out.println("From Two Args");
	}

	public Car(int id, String name,String color) {
		this(20,"hi");
		this.color=color;
		System.out.println("Form Three Formal Args");
	}

	public Car(int id, String name, String color, double price) {
		this(30,"hello","White");
		this.price = price;
		System.out.println(price);
		System.out.println(this.price);
		System.out.println("From Four Formal Args");
	}
	
}
