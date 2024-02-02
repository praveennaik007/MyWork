package Rough;

public class String_Prog1 {
	public static void main(String[] args) {
		String s = "html javascript sql css advancejava";
		String str[] = s.split(" ");
		String st="";
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if(str[i].length()>str[j].length()) {
					st=str[i];
				}
			}
		}
		System.out.println(st);
//		String string = "";
//		for (int i = 0; i < str.length; i++) {
//			string += " " + str[i].substring(0, str[i].length() - 1);
//		}
//		System.out.println(string + " ");
	}
}
