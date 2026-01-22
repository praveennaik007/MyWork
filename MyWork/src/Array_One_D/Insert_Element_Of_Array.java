package Array_One_D;

import java.util.Scanner;

public class Insert_Element_Of_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();	
		}
		int b[]=new int[a.length+1];
		System.out.println("Enter the index ");
		int index=sc.nextInt();
		System.out.println("Enter the element");
		int element=sc.nextInt();
		if(index>=a.length)
		{
			System.out.println("Invalid index");
		}
		else
		{
		    int j=0;
			for (int i = j; i < a.length; i++) {
				if(j==index)
				{
					b[j]=element;
					j++;
				}
				
				b[j]=a[i];
				j++;
			}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		}
	}
}
