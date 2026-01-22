package number_Program;

public class Nth_Fibnacci {
	public static void main(String[] args) {
		int a = 0, b = 1, res = 0, user = 10;
		for (int i = 1; true; i++) {
			if (i == user) {
				System.out.println(res);
				break;
			}
			res = a + b;
			a = b;
			b = res;
		}
	}
}
