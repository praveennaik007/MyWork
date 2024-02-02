package my_Work;

public class Smallest_Word_In_A_String {
	public static void main(String[] args) {
		String str = "java is a programming b language";
		System.out.println(smallestWord(str));
	}

	public static String smallestWord(String str) {
		String sw = str;
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String w = "";
			while (i < ch.length && ch[i] != ' ') {
				w = w + ch[i];
				i++;
			}
			if (w.length() < sw.length()) {
				sw = w;
			}
		}
		return sw;
	}
//	public static String smallestWord(String str) {
//		String w = str;
//		for (int i = 0; i <= str.length(); i++) {
//			String sw = "";
//			if (i == 0 && str.charAt(i) != ' ' || str.charAt(i) != ' ' && str.charAt(i - 1) == ' ') {
//
//				while (i < str.length() && str.charAt(i) != ' ') {
//					sw = sw + str.charAt(i);
//					i++;
//				}
//				if (sw.length() < w.length()) {
//					w = sw;
//				}
//			}
//			
//		}
//		return w;
//	}
}
