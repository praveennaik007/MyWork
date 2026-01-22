package Snippets_Java;

public class Snippet_45 {
	String a;

	public Snippet_45() {
		a += "hello";
	}

	public static void main(String[] args) {
		Snippet_45 s = new Snippet_45();
		System.out.println(s.a);
		System.out.println(new Snippet_45().a);
	}
}
