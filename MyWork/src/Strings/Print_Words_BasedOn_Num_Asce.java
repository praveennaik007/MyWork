package Strings;

public class Print_Words_BasedOn_Num_Asce {
public static void main(String[] args) {
	String s ="html2 java1 sql5 css3 advancejava4";
	String str[] = s.split(" ");

	for (int i = 0; i < str.length; i++) {
		for (int j = 0; j < str.length - 1; j++) {
			if (str[j].charAt(str[j].length() - 1) > str[j + 1].charAt(str[j + 1].length() - 1)) {
				String st = str[j];
				str[j] = str[j + 1];
				str[j + 1] = st;
			}
		}
	}
	String string = "";
	for (int i = 0; i < str.length; i++) {
		string += " " + str[i].substring(0, str[i].length() - 1);
	}
	System.out.println(string + "");
}
}
