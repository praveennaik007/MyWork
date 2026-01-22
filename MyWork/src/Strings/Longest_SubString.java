package Strings;

public class Longest_SubString {
	public static void main(String[] args) {
		String s = "ababaabcabcabcdababcabcdeababcaabbc";
		String max = "";
		for (int i = 0; i < s.length(); i++) {
			String str = "";
			for (int j = i; j < s.length(); j++) {
				if (!str.contains(s.charAt(j) + "")) {
					str += s.charAt(j);
				} else {
					break;
				}
			}
			if (str.length() > max.length()) {
				max = str;
			}

		}
		System.out.println(max + " ===> " + max.length());

	}
}
