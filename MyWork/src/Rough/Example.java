package Rough;

public class Example {
	public static void main(String[] args) {
		String s = "raju is my name";
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && s.charAt(i) != ' ' || s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
				String st = "";
				while (i < s.length() && s.charAt(i) != ' ') {
					st += s.charAt(i);
					i++;
				}
				System.out.println(st + " " + i);
			}
		}
	}
}
