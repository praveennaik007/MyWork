package Strings;

public class Print_Duplicate_Char_String {
	public static void main(String[] args) {
		String s = "abgcdfjgggggerjjjjj";
		String r="";
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					if(!r.contains(s.charAt(i)+"")) {
						r=r+s.charAt(i);
					}
				}
			}
		}
		System.out.println(r);

	}
}
