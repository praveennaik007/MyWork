package Method_Non_Primitive_Datatype_As_ReturnType;

public class A {
	int i = 10;
	int j = 20;

	public A(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "[ " + i + " , " + j + " ]";
	}

	public static A display(A a) {

		return a;
	}

	public static void main(String[] args) {
		A a = new A(10, 20);
		System.out.println(display(a));
	}

}
