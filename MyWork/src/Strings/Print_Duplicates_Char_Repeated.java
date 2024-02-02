package Strings;

public class Print_Duplicates_Char_Repeated {
	public static void main(String[] args) {
		String s = "Hello World word";
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (str.indexOf(s.charAt(i)) == -1 && s.charAt(i) != ' ') {
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						System.out.print(s.charAt(i));
						str += s.charAt(i);
						break;
					}
				}
			}
		}
	}
}
