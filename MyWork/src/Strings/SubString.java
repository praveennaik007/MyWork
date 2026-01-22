package Strings;

public class SubString {
	public static void main(String[] args) {
		// Using Inbuilt Method
		String s = "sum";
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i + 1; j <= s.length(); j++) {
//				System.out.println(s.substring(i, j));
//			}
//		}
		// Without Using Inbuilt Method
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
