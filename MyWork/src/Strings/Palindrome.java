package Strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//
		String n = sc.nextLine();
		String str = "";
		char ch[] = n.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			str = str + ch[i];
		}
		if (n.equals(str))
			System.out.println("true");

		else

			System.out.println("false");
	}
}
