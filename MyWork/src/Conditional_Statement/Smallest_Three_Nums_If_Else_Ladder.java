package Conditional_Statement;

public class Smallest_Three_Nums_If_Else_Ladder {
	public static void main(String[] args) {
		int a = 10, b = 5, c = 30;
		if (a < b && a < c) {
			System.out.println(a + " a is smallest ");
		} else if (b < c) {
			System.out.println(b + " b is Smallest ");
		} else {
			System.out.println(c + " c is Smallest ");
		}
	}
}
