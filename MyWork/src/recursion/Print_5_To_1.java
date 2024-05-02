package recursion;

public class Print_5_To_1 {
	public static void main(String[] args) {
		System.out.println(num(5));
	}

	public static int num(int n) {
		if (n == 0)
			return n;
		System.out.println(n);
		return n + num(n - 1);
	}
}
