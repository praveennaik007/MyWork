package Strings;

public class Reverse_Word_Same_Place {
	public static void main(String[] args) {
		System.out.println("Without using split() method ");
		String s = " hello world ";
		String res = "";

		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && s.charAt(i) != ' ' || s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
//				System.out.println(s.charAt(i));
				String temp = "";
				while (i < s.length() && s.charAt(i) != ' ') {
					temp += s.charAt(i);
					i++;
				} // hello
				for (int j = temp.length() - 1; j >= 0; j--) {
					res += temp.charAt(j);
				} // olleh
				res = res + " ";// olleh+" "||dlrow+" "||ih+" "||eyb+" "||olleh+" "||yojne+" "||
			}
		}
		System.out.println(res);
	

		System.out.println("Using split() method ");
		String str = "hello world to everyone ";
//		str=str.trim();
		String[] st = str.split(" ");
		
		String rev = "";
		for (int i = 0; i < st.length; i++) {
			String sin = "";
			sin += st[i];
			for (int j = sin.length() - 1; j >= 0; j--) {
				rev += sin.charAt(j);
			}
			rev += " ";
		}

		System.out.println(rev);
	}

}
