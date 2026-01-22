package Snippets_Java;

import java.util.Scanner;

import constructors.A;
import constructors.B;

public class Simple {
	public static void main(String[] args) {

//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the Number ");
//	int a=sc.nextInt();//input => hello
//	System.out.println(a);//InputMismatchException

		int a = 5;
		int b = 2;
		if ((a = 2) == b) {
			System.out.println(++b);
		} else {
			System.out.println(a + b);
		}

//	int a = 10, b = 10;
//	if (a == b) {
//		System.out.print(b+""+a + b + a);
//	}

//	System.out.print( 10+20+"10"+30-10+10 );

//	 Output:
//	 A. compiletime Error
//	 B. 10
//	 c. 20
//	 d. 30
	}
}
