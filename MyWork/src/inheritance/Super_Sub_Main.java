package inheritance;

public class Super_Sub_Main {
public static void main(String[] args) {
	Sub_Class s=new Sub_Class();
	s.n=10;
	s.k=20;
	System.out.println(s.k);
	System.out.println(s.n);
	s.m1();
	s.m2();
}
}
