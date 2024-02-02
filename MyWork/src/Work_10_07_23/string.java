package Work_10_07_23;

public class string {
	public static void main(String[] args) {
		String s = "ABCD";
		String s1 = "ACDF";
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s1.length(); j++) {
				if (s.charAt(i) == s1.charAt(j)) {
//					System.out.println(s.charAt(i));
					str += s.charAt(i);
				}
			}
		}
		System.out.println(str.length());
	}
}
