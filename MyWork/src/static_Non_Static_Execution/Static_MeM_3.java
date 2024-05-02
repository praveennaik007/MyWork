package static_Non_Static_Execution;

public class Static_MeM_3 {
	static int i = 10;
	int j = 30;
	boolean b = true;

public static void main(String[] args) {
	Static_MeM_3 s=new Static_MeM_3();
	System.out.println(s.j);
	System.out.println(s.i);
	System.out.println(s.b);
	System.out.println((new Static_MeM_3()).b);
	System.out.println(new Static_MeM_3());
}
}
