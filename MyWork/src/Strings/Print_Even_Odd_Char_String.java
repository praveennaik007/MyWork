package Strings;

import java.util.Scanner;

public class Print_Even_Odd_Char_String {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		

		for (int i = 0; i < n.length(); i++) 
		{
			char ch=n.charAt(i);
			if(i%2==0)
			
				System.out.println("odd  :"+  n.charAt(i));
			else {
				System.out.println("even :" +    n.charAt(i));
			}
		}


	}
}
