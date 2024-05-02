package Snippets_Java;

public class Snippet_33 {
	public static void main(String[] args) 
	{
		int a = 5;
		if (a <= 10) {
			System.out.print(a + " ");
			if (a >= 10) {
				System.out.print(a + a + " ");
				System.out.print(a + " ");
			} else {
				System.out.print(a * a + " ");
			}
		} else {
			System.out.print((a + a - a) + " ");
		}
	}
}
/*
Output:-
a. Compile Time Error
b. 5 10 5
c. 5 
d. 5 25
Answer:-d
*/
