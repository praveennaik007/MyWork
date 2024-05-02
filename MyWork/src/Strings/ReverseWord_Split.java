package Strings;

import java.util.Scanner;

public class ReverseWord_Split {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String str[] = n.split(" ");// {rama,is,king}
		String st = "";
		for (int j = str.length - 1; j >= 0; j--) {
			st = st + str[j] + " ";
		}
		System.out.println(st + " ");
	}
}
