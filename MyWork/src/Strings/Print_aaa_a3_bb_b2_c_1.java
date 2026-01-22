package Strings;

public class Print_aaa_a3_bb_b2_c_1 {
	public static void main(String[] args) {
		String s = "aaaabbbbcc";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			int c = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					c++;
				}
			}
			if (!res.contains(s.charAt(i) + "")) {
				res = res + s.charAt(i) + c;
			}
		}
		System.out.println(res);
	}
}
