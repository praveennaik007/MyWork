package Strings;

public class Count_VOw_Con_Num_SPl_String {
	public static void main(String[] args) {
		String s = "abc@123";
		int vow = 0, con = 0, num = 0, spl = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {
					vow++;
				} else {
					con++;
				}
			} else if (ch >= '0' && ch <= '9') {
				num++;
			} else {
				spl++;
			}

		}
		System.out.println(vow);
		System.out.println(con);
		System.out.println(num);
		System.out.println(spl);
	}
}
