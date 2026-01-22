package typeCasting_Of_Non_Primitive;

public class A_B_Main {
	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj.i);
//		System.out.println(obj.j);
		obj.m1();
	}
}
