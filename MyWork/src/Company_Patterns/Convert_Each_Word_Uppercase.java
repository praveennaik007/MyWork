package Company_Patterns;

public class Convert_Each_Word_Uppercase {
	public static void main(String[] args) {
		String s = "hello world";
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				str += (char) (s.charAt(i) - 32);
			} else {
				str += s.charAt(i);
			}
		}
		System.out.println(str);
	}
}
