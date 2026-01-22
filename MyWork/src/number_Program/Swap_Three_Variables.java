package number_Program;

public class Swap_Three_Variables {
	public static void main(String[] args) {
		int a = 30;
		int b = 10;
		int c = 20;
		int d = a + b + c;
		a = d - (a + b);
		b = d - (a + b);
		c = d - (b + c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
