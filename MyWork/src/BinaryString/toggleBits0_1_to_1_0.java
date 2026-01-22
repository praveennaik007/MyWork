package BinaryString;

public class toggleBits0_1_to_1_0 {
	public static void main(String[] args) {
		String s = "10101";
		System.out.println(togglebits(s));
	}

	public static String togglebits(String s) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			sb.append(c == '0' ? '1' : '0');
		}
		return sb.toString();
	}

}
