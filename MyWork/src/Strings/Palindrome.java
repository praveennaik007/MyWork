package Strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//
		System.out.println("Enter The String : ");
		String n = sc.nextLine();
		String str = "";
		char ch[] = n.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			str = str + ch[i];
		}
		if (n.equals(str))
			System.out.println("palindrome");
//		System.out.println("true");

		else
			System.out.println("Not palindrome");
//		System.out.println("false");
		
		
		//Without inbuilt Method
				int temp1 = 0;
				int temp2 = n.length() - 1;
				boolean rs = true;
				while (temp1 < temp2) {
					if (n.charAt(temp1) != n.charAt(temp2)) {
						rs = false;
						break;
					}
					temp1++;
					temp2--;
				}
				if (rs == true) {
					System.out.println("Palindrome ");
				} else {
					System.out.println("Not Palindrome ");
				}
	}
}
