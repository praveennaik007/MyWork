package my_Work;

public class Sum {
	public static void main(String[] args) {
		int n = 123;
		int sum = 0;
		for (int i = n; i > 0; i = i / 10) {
			int d = i % 10;
			sum += d;
		}
		System.out.println(sum);
	}
}
