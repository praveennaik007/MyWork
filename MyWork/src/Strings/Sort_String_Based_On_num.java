package Strings;

public class Sort_String_Based_On_num {
	public static void main(String[] args) {
		String s = "is2 java1 easy4 a3 language6 programming5";
		String str[] = s.split(" ");

		String st = "";
		String x = "";
		String y = "";
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].charAt(str[i].length() - 1) > str[j].charAt(str[j].length() - 1)) {
					String h = str[i];
					str[i] = str[j];
					str[j] = h;
				}
			}
		}
		for (String n : str) {
			x += n.substring(0, n.length() - 1) + " ";
		}
		System.out.println(x);

		System.out.println("********************");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[j - 1].charAt(str[j - 1].length() - 1) > str[j].charAt(str[j].length() - 1)) {
					String temp = str[j - 1];
					str[j - 1] = str[j];
					str[j] = temp;
				}
			}
		}
		for (String a : str) {
			st = st + a.substring(0, a.length() - 1) + " ";
		}
		System.out.println(st);

	}
}
