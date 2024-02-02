package Strings;

public class Print_a3_aaa_b2_bb_c1_c {
	public static void main(String[] args) {
		String s = "a3b2c1";
		String str = "";
		int c = 0;
		for (int i = 0; i < s.length(); i += 2) {
			c = s.charAt(i + 1) - 48;
//		System.out.println(c);
			for (int j = 0; j < c; j++) {
//				System.out.print(s.charAt(i));
			str+=s.charAt(i);
			}
		}
	System.out.println(str);
	}
}
