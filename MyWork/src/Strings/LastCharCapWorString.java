package Strings;

import java.util.Scanner;

public class LastCharCapWorString {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		String str=" ";
		char ch[]=n.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else
			{
				if(ch[i]>='A'&&ch[i]<='Z')
					ch[i]=(char)(ch[i]+32);
			}
		}
		str=new String(ch);
		System.out.println(str);
	}
}
