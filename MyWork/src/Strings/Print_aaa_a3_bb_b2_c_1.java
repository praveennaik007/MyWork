package Strings;

public class Print_aaa_a3_bb_b2_c_1 {
	public static void main(String[] args) {
		String s = "aaabbc";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			int c = 0;
			char ch = s.charAt(i);
			for (int j = 0; j < s.length(); j++) {
				if (ch == s.charAt(j)) {
					c++;
				}
			}
			if (!res.contains(ch + "")) {
				res = res + ch + c;
			}
		}
		System.out.println(res);
	}
}
