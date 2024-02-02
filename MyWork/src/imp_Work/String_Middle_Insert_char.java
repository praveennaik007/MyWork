package imp_Work;

import java.util.Arrays;

public class String_Middle_Insert_char {
	public static void main(String[] args) {
		String s = "number";
		char c = '#';
		char ch[] = s.toCharArray();
		char str[] = new char[ch.length + 1];
		int j = 0;
		for (int i = 0; i < str.length; i++) {
			if (i == (ch.length) / 2) {
				str[i] = c;
			}
			else {
				str[i]=ch[j++];
			}
		}
		System.out.println(Arrays.toString(str));
	}
}
