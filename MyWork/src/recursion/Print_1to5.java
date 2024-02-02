package recursion;

public class Print_1to5 {
	public static void main(String[] args) {
		print(1);
	}

	private static void print(int n) {
		if (n == 6) {
			return;
		} else {
			print(n + 1);
			System.out.println(n);
		}
	}
}
