package Interface;
public class Super_Sub_Main implements Super,Sub{
	public void m2() {
		System.out.println("From M2");
	}
	public void m1() {
		System.out.println("From M1");
	}
public static void main(String[] args) {
	Super_Sub_Main m=new Super_Sub_Main();
	m.m1();
	m.m2();
	m.m3();
	m.m4();
	m.m5();
}
public void m5() {
System.out.println("From M5");	
}
}
