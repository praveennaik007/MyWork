package Strings;

public class Remove_Duplicates_Char {
	public static void main(String[] args) {
		String s = "Hello World";
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			if (str.indexOf(s.charAt(i)) == -1 && s.charAt(i) != ' ') {
				count++;
				System.out.print(s.charAt(i));
				str += s.charAt(i);
			}
		}
	}
}
