package BinaryString;

public class Count_Zeros_Ones {
	public static void main(String[] args) {
		String s="0101";
		countZeroOne(s);
	}

	public static void countZeroOne(String s) {
		int zero = 0, one = 0;
		for (char c : s.toCharArray()) {
			if (c == '0') {
				zero++;
			} else {
				one++;
			}
		}
		System.out.println(zero + " " + one);

	}
}
