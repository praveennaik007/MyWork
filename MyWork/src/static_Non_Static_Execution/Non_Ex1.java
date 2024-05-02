package static_Non_Static_Execution;

public class Non_Ex1 {
	int i=10;
//	{
//		System.out.println(this);
//	}
	
	static Non_Ex1 obj1=new Non_Ex1();
	
public static void main(String[] args) {	
	Non_Ex1 obj=new Non_Ex1();
//	System.out.println(Non_Ex1.obj);
//	System.out.println(obj);
	System.out.println(obj.i);
//	Non_Ex1 ob2=new Non_Ex1();
}
}
