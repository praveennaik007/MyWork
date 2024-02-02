package AccessSpecifer_1;

public class A_B_Main {
	public static void main(String[] args) {
		 int i=10;
		 System.out.println(i);
		B obj=new B();
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.x);
		obj.Walk();
		obj.run();
	}
}
