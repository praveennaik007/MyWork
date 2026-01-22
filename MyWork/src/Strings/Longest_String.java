package Strings;

public class Longest_String {
	public static void main(String[] args) {
		String s = "this is java program";
		String st[] = s.split(" ");
		String str = "";
		for (int i = 0; i < st.length; i++) {
			if (st[i].length() > str.length()) {
				str = st[i];
			}
		}
		System.out.println(str);
		
//		String s = "this is java program";
//		String st[] = s.split(" ");
//		String str = "";
//		for (int i = 0; i <= st.length; i++) {   
//		    if (st[i].length() > str.length()) {
//		        str = st[i];
//		    }
//		}
//		System.out.println(str);//ArrayIndexOutOfBoundsException
	}
}
