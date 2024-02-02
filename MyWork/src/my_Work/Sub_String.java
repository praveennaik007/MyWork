package my_Work;

public class Sub_String {
	public static void main(String[] args) {
		String s = "java";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}
	}
}
