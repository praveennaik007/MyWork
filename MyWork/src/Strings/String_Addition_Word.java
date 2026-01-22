package Strings;

public class String_Addition_Word {
	public static void main(String[] args) {
		String s = "there are 330 books 145 materials 546  in library";
		Integer a;
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && s.charAt(i) != ' ' || s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
//				System.out.println(s.charAt(i));
				if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					String str = "";
					while (i < s.length() && s.charAt(i) != ' ') {
						str += s.charAt(i);
						i++;
					}
//					System.out.println(str);
					a = Integer.parseInt(str);
					res += a;
				}
			}
		}
		System.out.println(res);// 475
	}
}
