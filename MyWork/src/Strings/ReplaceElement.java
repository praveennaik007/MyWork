package Strings;

import java.util.Scanner;

public class ReplaceElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String n = sc.next();
		n = n.toLowerCase();
		char ch[] = n.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
				ch[i] = '$';

		}
		System.out.println(ch);
	}
}
