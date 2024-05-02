package static_Non_Static_Execution;


public class Example_1 {
	static int b=20;
	int a=10;
static Example_1  e=new Example_1();
public static void main(String[] args) {
	System.out.println(e.a);
	System.out.println(e.b);
	System.out.println(e.e.e.e.a);
}
}
