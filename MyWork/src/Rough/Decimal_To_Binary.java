package Rough;

public class Decimal_To_Binary {
	public static void main(String[] args) {
//		int n = 16;
//		String s = "";
//		while (n > 0) {
//			int d = n % 2;
//			s = d + s;
//			n /= 2;
//		}
//		System.out.println(s);
		System.out.println(decToBin(12));
	}

	public static String decToBin(int dec) {
		String bin = "";
		do {
			int d = dec % 2;
			bin = d + bin;
			dec = dec / 2;
		} while (dec != 0);
		return bin;
	}
}
