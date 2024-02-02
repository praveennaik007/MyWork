package constructor_Overloading;

public class Demo1 {
	int id;
	String name;
	double marks;

	public Demo1(int id) {
		this.id = id;
		System.out.println("first Constructor ");
	}

	public Demo1(int id, String name) {
		
		this.name = name;
		System.out.println("second Constructor");
	}

	public Demo1(int id, String name, double marks) {
		
		this.marks = marks;
		System.out.println("third Constructor");
	}

}
