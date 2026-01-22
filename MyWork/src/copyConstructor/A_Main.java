package copyConstructor;

public class A_Main {
	public static void main(String[] args) {
		A a = new A(1, "abc", 78.89);
//		System.out.println(a.id);
//		System.out.println(a.name);
//		System.out.println(a.price);
//		System.out.println("*********************");
		A b = new A(a)   ;
		System.out.println(b.id);
		System.out.println(b.name);
		System.out.println(b.price);
	}
}
