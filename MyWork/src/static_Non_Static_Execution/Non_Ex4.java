package static_Non_Static_Execution;

public class Non_Ex4 {
	int i = 10;

	Non_Ex4 obj = new Non_Ex4();

	public static void main(String[] args) {
		Non_Ex4 obj = new Non_Ex4();
		System.out.println(obj.i);
		System.out.println(obj.obj.obj.obj.obj.i);
	}
}
