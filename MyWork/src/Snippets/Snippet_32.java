package Snippets;

public class Snippet_32 {
	public static void main(String[] args) {
		int a = 10;
		for (int i = a; i <= ++a; i += 2) {
			System.out.print(i + " ");
		}
	}
}
/*
Output:-
a. 10 12 
b. 10
c. Compile Time Error
d. Infinity
Answer:-a
*/
