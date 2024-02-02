package Inbuild_Libraries;

public class B extends A{
int j=20;
public static void main(String[] args) {
	B obj = (B)new A();
//	A obj1 = (A) obj;
//	System.out.println(obj1.i);
	System.out.println(obj.i);
//	System.out.println(obj.j);
}
}
