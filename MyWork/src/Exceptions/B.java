package Exceptions;

import java.util.Scanner;

public class B {
	static Scanner sc=new Scanner(System.in);
	static int div;
public static void main(String[] args) {
	A [] obj=new A[5];
	obj[0]=new A(10,5);
	obj[1]=new A(10,0);
	System.out.println("Enter the index value a : ");
	int a=sc.nextInt();
	System.out.println("Enter the index Value b : ");
	int b=sc.nextInt();
	try {
	div=obj[a].i/obj[b].j;
	}catch(ArithmeticException e) {
		System.out.println("Do not Divid by zero");
	}catch (NullPointerException e) {
		System.out.println("Do not access the refference value ");
	}catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("Do not access Out of Index ");
	}
	System.out.println(div);
}
}
