package Abstraction;

abstract public class A implements Interface {
 int i;
 static int j=20;
abstract public void run();
public static void m1() {
	System.out.println("Hello");
}
public void m2() {
	System.out.println("From M2 Method");
}
public A(int i) {
	super();
	this.i=i;
	
}
}
