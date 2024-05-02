package static_Non_Static_Execution;

public class Example_2 {
	static int i=10;
	int j=20;
Example_2 e=new Example_2();
public static void main(String[] args) {
	Example_2 e1=new Example_2();
	System.out.println(e1.j);
	System.out.println(e1.i);
}
}
