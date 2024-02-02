package Strings;

public class Frequency_char {
	public static void main(String[] args) {
		String s ="Hello World";
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (str.indexOf(s.charAt(i)) == -1 && s.charAt(i)!=' ') {
				int count = 0;
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
					}
				}
				System.out.print(s.charAt(i) + "=" + count+" ");
				str += s.charAt(i);
			}
		}
	}
}
