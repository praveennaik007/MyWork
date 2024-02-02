package number_Program;

public class Three_Nums_Asscending_Order {
	public static void main(String[] args) {
		int a = 50;
		int b = 40;
		int c = 10;
		int temp = 0;
		if (a > b) {
			temp = b;
			b = a;
			a = temp;
		}
		if (b > c) {
			temp = c;
			c = b;
			b = temp;
		}
		if (a > b) {
			temp = b;
			b = a;
			a = temp;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
