package Strings;

public class Palindrome_Sentance_String {
	public static void main(String[] args) {
//		String s = "the level of malayalam is dificult madam";
//		String str[] = s.split(" ");
//		int max = 0;
//		String strg = "";
//		for (int i = 0; i < str.length; i++) {
//			String a = str[i];
//			String st = "";
//			for (int j = a.length() - 1; j >= 0; j--) {
//				st += a.charAt(j);
//			}
//			if (a.equals(st)) {
//				if (a.length() > max) {
//					max = a.length();
//					strg = st;
//				}
//			}
//		}
//		System.out.println(strg);
		String s = "the level of malayalam is dificult madam";
		String str[] = s.split(" ");
		int max = 0;
		String strg = "";
		for (int i = 0; i < str.length; i++) {
		    String a = str[i];
		    String st = "";
		    for (int j = a.length() - 1; j >= 0; j--) {
		        st += a.charAt(j);
		    }
		    if (a.equals(st)) {
		        if (a.length() >= max) {   // ❌ changed > to >=
		            max = a.length();
		            strg = st;
		        }
		    }
		}
		System.out.println(strg);

	}
}
