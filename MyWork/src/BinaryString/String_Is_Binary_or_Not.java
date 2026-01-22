package BinaryString;

public class String_Is_Binary_or_Not {
	public static void main(String[] args) {
		String s = "1010101";
		System.out.println(isBinary(s));
	}

	static boolean isBinary(String s) {
		for (char c : s.toCharArray()) {
			if (c != '0' && c != '1')
				return false;
		}
		return true;
	}
}
