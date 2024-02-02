package static_Non_Static_Execution;

public class Accessing_static_Non_static_with_this_keyword {
	static int i = 10;
	int j = 20;
	{
		System.out.println(this.i);
		System.out.println(this.j);
	}

	public static void main(String[] args) {
		Accessing_static_Non_static_with_this_keyword a = new Accessing_static_Non_static_with_this_keyword();
		Accessing_static_Non_static_with_this_keyword a1 = new Accessing_static_Non_static_with_this_keyword();

	}
}
