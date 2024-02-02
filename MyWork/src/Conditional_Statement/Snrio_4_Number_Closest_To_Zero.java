package Conditional_Statement;

public class Snrio_4_Number_Closest_To_Zero {
	public static void main(String[] args) {
		int a = -2, b = 3;
		int x = Math.abs(a - 0);
		int y = Math.abs(b - 0);

		if (x < y) {
			System.out.println(x + " x is Closest Number");
		} else {
			System.out.println(y + " y is Closest Number");
		}
	}
}
