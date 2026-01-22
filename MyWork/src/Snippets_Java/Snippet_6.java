package Snippets_Java;

public class Snippet_6 {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(snip(n));
	}

	public static int snip(int n) {
		if (n == 0)
			return 1;
		return snip(n - 1) * n;
	}
}
