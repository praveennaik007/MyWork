package Snippets;

public class Snippet_14 {
	public static void main(String[] args) {
		int a = 10, b = 20;
		if (a < b) {
			System.out.print(a + " ");
			System.out.print();
			System.out.println(a + b);
		} else {
			System.out.println(a + b + a);
		}
	}
}
/*
Output :-
a. 10 30
b. Compile Time Error 
c. 40
d. 10 20 30
Answer:b
*/