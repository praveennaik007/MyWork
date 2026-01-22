package Rough;

public class Remove_Duplicates_String {
	public static void main(String[] args) {
		String s = "geeks for geeks";
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
	}
}
