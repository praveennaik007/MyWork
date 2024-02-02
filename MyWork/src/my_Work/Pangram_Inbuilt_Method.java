package my_Work;

import java.util.Scanner;

public class Pangram_Inbuilt_Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = sc.nextLine();
//		String s = " the quick brown fox jumps over the lazy dog ";
		s = s.replace(" ", "");
		s = s.trim();
		if (isPangram(s) == true) {
			System.out.println("Pangram ");
		} else {
			System.out.println("Not Pangram ");
		}
	}

	public static boolean isPangram(String s) {
		if (s.length() < 26) {
			return false;
		}
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (s.indexOf(ch) == -1)
				return false;

		}
		return true;
	}
}
