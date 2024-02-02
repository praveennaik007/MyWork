package Snippets;

public class Snippet_4 {
	public static void main(String[] args) {
		int a = 10, b = 11;
		int c = a++ + --b + b++ +++a + a-- + --b;
		System.out.println(c);
	}
}
