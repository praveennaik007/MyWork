package Snippets_Java;

public class Snippet_21 {
	Snippet_21() {
		System.out.print("hi" + " ");
	}

	public static void main(String[] args) {
		Snippet_21 obj = new Snippet_21();
		new Snippet_21();
	}
}
/*
 * Output: a. hi b. hi hi hi c. CompileTime Error d. hi hi
 * 
 */