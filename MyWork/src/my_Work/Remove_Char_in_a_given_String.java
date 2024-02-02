package my_Work;

public class Remove_Char_in_a_given_String {
	public static void main(String[] args) {
		String s = "java is a java aaadd";
		char ch = 'a';
		for (int i = 0; i < s.length(); i++) {
			if (ch == s.charAt(i)) {
				continue;
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
