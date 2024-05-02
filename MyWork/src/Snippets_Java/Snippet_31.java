package Snippets_Java;

public class Snippet_31 {
	public static void main(String[] args) {
		int a = 5;
		for (int i = 1; i <= --a; i++) {
			System.out.print(i+" ");
		}
	}
}
/*
 Output:- 
 a. 1 2 3
 b. 1 2 3 4 5
 c. 1 2 
 d. Compile Time Error
 Answer:-c
 */
