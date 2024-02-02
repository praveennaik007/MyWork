package number_Program;

import java.util.Scanner;

public class N_to_Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		System.out.println("Enter the power ");
		int pow = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= pow; i++) {
			fact = fact * num;
		}
		System.out.println(fact);

//	System.out.println("Enter the number ");
//	int num=sc.nextInt();
//	System.out.println("Enter the power ");
//	int pow=sc.nextInt();
//	int prod=1;
//	while(pow>0)
//	{
//		prod=prod*num;
//		pow--;
//	}
//	System.out.println(prod);
//	
//	System.out.println();
//	//Using forLoop
	}
}
