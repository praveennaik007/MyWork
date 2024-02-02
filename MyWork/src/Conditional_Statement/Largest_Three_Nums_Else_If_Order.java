package Conditional_Statement;

public class Largest_Three_Nums_Else_If_Order {
	public static void main(String[] args) {
		int a = 10, b = 10, c = 10;
		if (a > b && a > c) {
			System.out.println(a + " a is Largest ");
		} else if (b > c) {
			System.out.println(b + " b is Largest ");
		} else if (b < c) {
			System.out.println(c + " c is Largest ");
		} else {
			System.out.println("All are same");
		}
	}
}
