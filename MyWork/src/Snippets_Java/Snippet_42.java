package Snippets_Java;

public class Snippet_42 {
	public static void main(String[] args) {
		int a=10;int b=20;int c=30;
		int d=a++ || ++b ||c++;
		System.out.println(d);
	}
}
/*
 Output:
 a. 10
 b. 20
 c. CompileTime Error
 d. Runtime Error
 Answer:c 
 */
