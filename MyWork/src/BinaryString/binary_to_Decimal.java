package BinaryString;

public class binary_to_Decimal {
	public static void main(String[] args) {
		String s = "1010";
		System.out.println(binaryToDecimal(s));
	}

	public static int binaryToDecimal(String s) {
		return Integer.parseInt(s, 2);
	}
}
