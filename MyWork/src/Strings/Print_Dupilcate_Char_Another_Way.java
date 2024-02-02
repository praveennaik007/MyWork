package Strings;

public class Print_Dupilcate_Char_Another_Way {
	public static void main(String[] args) {
		String s = "Hello World word";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = 1;
				}
			}
			if (count >= 1 && ch[i] != 1 && ch[i] != ' ') {
				System.out.print(ch[i]);
			}
		}
	}
}
