package Snippets_Java;

public class Snippet_13 {
	public static void main(String[] args) {
		int a = 6, b = 17, c = 9,d = 25;
		int x = (a > b) ? a : b;
		int y = (x < c) ? x : c;
		int z = (y > d) ? y : d;
		System.out.println(z);
	}
}
/*
OutPut :-
a. 17
b. 9
c. 25 
d. Compile Time Error

OutPut:c
 */
