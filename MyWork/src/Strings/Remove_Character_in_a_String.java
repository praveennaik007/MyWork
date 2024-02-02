package Strings;

public class Remove_Character_in_a_String {
	public static void main(String[] args) {
		String str = "abbcccd";
		str = str + " ";
		String s = "";
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				i = i + 1;
			} else if (str.length() - 2 == str.charAt(i)) {

			} else {
				System.out.print(str.charAt(i));
			}
		}
	}
}
