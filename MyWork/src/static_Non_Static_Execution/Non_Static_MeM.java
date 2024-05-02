package static_Non_Static_Execution;

public class Non_Static_MeM {
int i=100;
{
//	System.out.println(this);
	Non_Static_MeM n=new Non_Static_MeM();
//	System.out.println(n.i);
	
}
//Non_Static_MeM n=new Non_Static_MeM();

public void m1() {
	System.out.println(this);
}
public static void main(String[] args) {
	Non_Static_MeM n=new Non_Static_MeM();
	System.out.println(n);
	System.out.println(n.i);
	n.m1();
}
}
