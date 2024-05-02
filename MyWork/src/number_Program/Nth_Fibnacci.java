package number_Program;

public class Nth_Fibnacci {
	public static void main(String[] args) {
		int a = 0, b = 1, res = 0, n = 10;
		while (res <= n) {
			
			res = a + b;
			a = b;
			b = res;
			if (res == n) {
				System.out.println(a);
			}
		}
	}
}
