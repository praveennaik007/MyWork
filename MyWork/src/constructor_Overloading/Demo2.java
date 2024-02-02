package constructor_Overloading;

public class Demo2 {
	int i;
	int j;

	public Demo2(int i, int j) {
		this(1);
		this.i = i;
		this.j = j;
		System.out.println("First Constructor ");
	}

	public Demo2(int i) {
		this(1, 2);
		System.out.println("Second Constructor ");
	}
	public static void main(String[] args) {
		Demo2 d=new Demo2(1);
	}
}
