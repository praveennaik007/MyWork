package Rough;

public class Demo_1 {
	public static void main(String[] args) {
		String s = "hhhhhgddgg";//"this is a simple method";
		String max = "";
		String min = "";
		String str = "";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (str.indexOf(ch[i]) == -1 && ch[i] != ' ') {
				int count = 0;
				for (int j = 0; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
					}
				}
				if (count > 2) {
					max = " " + ch[i];
				}
				if (count < 2) {
					min += " " + ch[i];
				}
				str += ch[i];
			}
		}
		System.out.println("max -> " + max);
		System.out.println("min -> " + min);
	}
}
