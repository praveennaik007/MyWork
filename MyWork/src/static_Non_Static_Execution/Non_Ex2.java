package static_Non_Static_Execution;

public class Non_Ex2 {
int i=10;
{
	Non_Ex2 obj=new Non_Ex2();
	System.out.println(obj.i);
}
public static void main(String[] args) {
	Non_Ex2 obj=new Non_Ex2();	
}
}
