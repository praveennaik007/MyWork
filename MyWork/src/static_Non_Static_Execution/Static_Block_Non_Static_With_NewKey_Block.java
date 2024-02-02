package static_Non_Static_Execution;

public class Static_Block_Non_Static_With_NewKey_Block {
	static {
		System.out.println("Hello");
	}
	static {
		System.out.println("Em Cheppu");
	}
	{
		System.out.println("Em Ledu urike");
	}
	{
		System.out.println("Ok");
	}
public static void main(String[] args) {
	Static_Block_Non_Static_With_NewKey_Block s=new Static_Block_Non_Static_With_NewKey_Block();
	System.out.println("Bye");
}
}
