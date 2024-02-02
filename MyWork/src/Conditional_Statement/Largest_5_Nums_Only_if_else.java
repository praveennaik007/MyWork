package Conditional_Statement;

public class Largest_5_Nums_Only_if_else {
	public static void main(String[] args) {
		int a = 2, b = 10, c = 6, d = 6, e = 8;
		if (a > b && a > c && a > d && a > e) {
			System.out.println(a + " a is largest ");
		} else {
			if (b > c && b > d && b > e) {
				System.out.println(b + " b is Largest ");
			} else {
				if (c > d && c > e) {
					System.out.println(c + " c is Largest ");
				} else {
					if (d > e) {
						System.out.println(d + " d is Largest ");
					} else {
						System.out.println(e + " e is Largest ");
					}
				}
			}
		}
	}
}
