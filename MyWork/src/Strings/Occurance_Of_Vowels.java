package Strings;

import java.util.Scanner;

public class Occurance_Of_Vowels {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();
		s=s.toLowerCase();
		String str="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			int vow=0;
			if(str.indexOf(ch)==-1)
			{
				for (int j = 0; j < s.length(); j++) {
					if(s.charAt(i)==s.charAt(j))
					{
						vow++;
						
					}
				}
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					System.out.println(ch+" "+vow);
				}
				str+=ch;
			}	
		}	
	}
}
