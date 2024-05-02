package Strings;

import java.util.Scanner;

public class MergeTwoArray {
	public static void main(String[] args) 
	{
		MergeTwoArray mta=new MergeTwoArray();
		System.out.println("first array");
		int a[]=mta.readArray();
		System.out.println("secoun array");
		int b[]=mta.readArray();
	
		int merge[]=mta.mergeTwoArr(a, b);
		System.out.println("merge array");
		mta.dispArray(merge);
		}
		int[] readArray()
		{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
		public static void dispArray(int a[])
		{
			for (int i = 0; i < a.length; i++) 
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		public static int[] mergeTwoArr(int a[],int b[])
		{
			int c[]=new int[a.length+b.length];
			for (int i = 0; i < a.length; i++) 
			{
				c[i]=a[i];
			}
			for (int i = 0; i < b.length; i++) 
			{	
				c[a.length+i]=b[i];
			}
			return c;
		}

}
