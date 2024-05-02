package static_Non_Static_Execution;

public class B {
	
public static void main(String[] args) {
	System.out.println(A.i);
	A a=new A();
	System.out.println(a.j);
	System.out.println(C.i);
	C c=new C();
	System.out.println(c.j);
}
}
