package Strings;

public class Mid_Rigth_Left_Left_Right {
	public static void main(String[] args) {
		String s = "abcdef";
		String st = "";
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (i < s.length() / 2) {
				st += (char) (s.charAt(i) - 32);
			} else {
				str += s.charAt(i);
			}
		}
		System.out.println(str + "" + st);
	}
}
