package Strings;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "sIlent";
		String s2 = "Listen";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		sort(ch1);
		sort(ch2);
		boolean rs = false;
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] == ch2[i]) {
				rs = true;
			}
		}
		if (rs == true) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

	public static char[] sort(char ch[]) {
		char temp = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[j] > ch[j + 1])
					temp = ch[j];
				ch[j] = ch[j + 1];
				ch[j + 1] = temp;
			}
		}
		return ch;
	}
}
