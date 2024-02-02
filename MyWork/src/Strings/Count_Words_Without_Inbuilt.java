package Strings;

public class Count_Words_Without_Inbuilt {
	public static void main(String[] args) {
		String s = " Hello World   Hi bye hleeo";
		char ch[] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ' && ch[i - 1] == ' ') {
				count++;
			}
		}
		System.out.println(count);
//		String s = "java is a programming language";
//		int count = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if (i == 0 && s.charAt(i) != ' ' || s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
//				count++;
//			}
//		}
//		System.out.println(count);

	}
}
