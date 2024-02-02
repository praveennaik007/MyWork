package constructors;

public class Demo {
String a;
int b;
int c;
public Demo(String name,int id,int age){
	this.a=name;
	this.b=id;
	this.c=age;
}
public static void main(String[] args) {
	Demo d=new Demo("hi", 1, 23);
	System.out.println(d.a);
	System.out.println(d.b);
	System.out.println(d.c);
}
}
