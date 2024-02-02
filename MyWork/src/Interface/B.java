package Interface;

public class B implements A{
	  
public static void main(String[] args) {
	B b=new B();
	b.m1();
	b.m2();
}

@Override
public void m1() {
System.out.println("from M1()");	
}

@Override
public void m2() {
System.out.println("From m2()");	
}
}
