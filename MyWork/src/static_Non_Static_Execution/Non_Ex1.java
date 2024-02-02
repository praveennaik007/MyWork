package static_Non_Static_Execution;

public class Non_Ex1 {
	{
		System.out.println(this);
	}
public static void main(String[] args) {	
	Non_Ex1 obj=new Non_Ex1();
	Non_Ex1 ob2=new Non_Ex1();
}
}
