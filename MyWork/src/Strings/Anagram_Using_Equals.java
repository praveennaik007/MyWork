package Strings;

import java.util.Arrays;

public class Anagram_Using_Equals {
	public static void main(String[] args) {
		String s="anagram";
		String s1="nagaram";
		char c[]=s.toCharArray();
		char c1[]=s1.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		boolean rs=Arrays.equals(c, c1);
		if(rs)
		{
			System.out.println("Anagram ");
		}
		else
		{
			System.out.println("Not Anagram ");
		}
	}
}
