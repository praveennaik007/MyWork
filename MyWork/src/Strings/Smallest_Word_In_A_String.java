package Strings;

public class Smallest_Word_In_A_String {
	public static void main(String[] args) {
		String str = "java is a programming b language";
//		System.out.println(smallestWord(str));
//	}

//	public static String smallestWord(String str) {
		String sw = str;
		System.out.println(sw);
//		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			String w = "";
			while (i < str.length() && str.charAt(i) != ' ') {
				w = w + str.charAt(i);
				i++;
			}
			if (w.length() < sw.length()) {
				sw = w;
			}
		}
//		return sw;
		System.out.println(sw);
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
