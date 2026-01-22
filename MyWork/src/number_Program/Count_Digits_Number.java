package number_Program;

public class Count_Digits_Number {
	public static void main(String[] args) {
		int n = 12345, c = 0;
		while (n > 0) {
			c++;
			n = n / 10;
		}
		System.out.println(c);
	}
}
