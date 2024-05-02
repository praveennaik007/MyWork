package static_Non_Static_Execution;

public class Static_MeM_1 {
	static int i=50;
	int j=70;
	static Static_MeM_1 s=new Static_MeM_1();
public static void main(String[] args) {
	int i=100;
	int j=202;
	Static_MeM_1 s1=new Static_MeM_1();
	
	System.out.println(s.s.j);
	System.out.println(s.s.s.s.s.s.s.i);
}
}
