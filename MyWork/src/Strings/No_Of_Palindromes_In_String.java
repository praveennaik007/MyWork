package Strings;

public class No_Of_Palindromes_In_String {
	public static void main(String[] args) {
		String s = "abhil323lihklmlabab";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			String str = s.charAt(i) + "";
			for (int j = i + 1; j < s.length(); j++) {
				str = str + s.charAt(j);
				if (palindrome(str)) {
					System.out.print(str+" ");
					count++;
				}
			}
		}
		System.out.println(count);
	}

	private static boolean palindrome(String str) {
		String st = "";
		for (int i = 0; i < str.length(); i++) {
			st = str.charAt(i) + st;
		}
		if (str.equals(st))
			return true;

		return false;
	}
}
