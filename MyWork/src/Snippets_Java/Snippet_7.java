package Snippets_Java;

public class Snippet_7 {
	public static void main(String[] args) 
	{
		int a = 5, b = 10;
		if (a < b) {
			boolean c = (a > b);
			System.out.println(c);
		} else {
			System.out.println(b > a);
		}
	}
}
// false