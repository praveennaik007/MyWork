package Strings;

public class Remove_Duplicates_Another_Way {
	public static void main(String[] args) {
		String s = "Hello World word";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = 1;
				}
			}
			if (ch[i] != 1 && ch[i] != ' ') {
				System.out.print(ch[i]);
			}
		}
		System.out.println();
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i + 1; j < s.length(); j++) {
//				if (s.charAt(i) == s.charAt(j)) {
////					s.charAt(j) = 1;
//					
//				}
//			}
//			if (s.charAt(i) != 1 && s.charAt(i) != ' ') {
//				System.out.print(s.charAt(i));
//			}
//		}
	}
}
