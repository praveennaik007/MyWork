package Array_One_D;

import java.util.Scanner;

public class Array_Magic {
	
	public static void main(String[] args) 
	{
		while (true) 
		{
			int i=1;
			int a[]=new int[i];
			int temp[]=a;
			temp[i-1]=new Scanner(System.in).nextInt();
			System.out.println("Do you want to enter one more number : yes/ no");
			String input=new Scanner(System.in).next();
			if (input.equalsIgnoreCase("no"))
			{
				
				break;
			}
		}
	}

}
