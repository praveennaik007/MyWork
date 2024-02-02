package static_Non_Static_Execution;

public class Non_Ex3 {
int i=10;
static Non_Ex3 obj=new Non_Ex3();
public static void main(String[] args) {
	System.out.println(Non_Ex3.obj.i);
	System.out.println(Non_Ex3.obj.obj.obj.obj.obj.i);
}
}
