package Strings;

public class Reverse_Sentence_without_Inbuilt {
	public static void main(String[] args) {
		String s = "hello world hi to every one";
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				s1 = s.charAt(i) + s1;
//				System.out.println(s1);
			} else {
				System.out.print(s1 + " ");
				s1 = "";
			}
		}
//		s = " " + s;
	 	System.out.println(s1);
	}
}
