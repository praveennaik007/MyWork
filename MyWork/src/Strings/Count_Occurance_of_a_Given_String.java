package Strings;

public class Count_Occurance_of_a_Given_String {
	public static void main(String[] args) {
		String s = "hello World";
		char ch = 'l';
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (ch == s.charAt(i)) {
				count++;
			}
		}
		System.out.println(ch + " " + count);
	}
}
