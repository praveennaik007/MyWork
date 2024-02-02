package Rough;

public class A {
public static void main(String[] args) {
//	if(1<=10) 
//		System.out.println(1);
//		System.out.println(2);
////		else 
////			System.out.println(3);
	System.out.println("Without using logical operator of 3 numbers large");
	int x=10,y=60,z=30;
	int res=(x>y)?((x>z)?x:z):((y>z)?y:z);
	System.out.println(res);
	System.out.println("Without using logical operator of 4 numbers large");
	//Without Using Logical Operators
	int a=30,b=20,c=90,d=50;
	int num=(a>b)?(a>c)?(a>d?a:d):(b>c?b:c):(b>c)?(b>d?b:d):(c>d?c:d);
	System.out.println(num);
}
}
