package static_Non_Static_Execution;

public class Static_Non_Static_Var_And_Blocks {
static int a=10;
static int b=40;
static {
	System.out.println("Hey");
}
static {
	System.out.println("Hi");
}
{
	System.out.println("Hello");
}
{
	System.out.println("Hmm");
}
public static void main(String[] args) {
	Static_Non_Static_Var_And_Blocks s=new Static_Non_Static_Var_And_Blocks();
	int x=30;
	int y=60;
	System.out.println(a);
	System.out.println(b);
	System.out.println(x);
	System.out.println(y);
	
	
}
}
