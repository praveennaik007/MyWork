package Strings;

public class SubString_Palindrome {
	public static void main(String[] args) {
		String s="malayalam";
		s=s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}
	}
}
