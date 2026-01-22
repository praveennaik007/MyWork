package my_Work;

public class Reverse_Words_Without_Inbult {
	public static void main(String[] args) {
		String s = "you are my hero";
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				s1 = s.charAt(i) + s1;
			} else {
				System.out.print(s1 + " ");
				s1 = "";
			}
		}
		s = " " + s;
		System.out.println(s1);
	}
}
