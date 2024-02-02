package Snippets;

public class Snippet_30 {
	public void m1() {
		System.out.print("1");
	}
	public static int add(int a,int b) {
		return (a+b);
	}
public static void main(String[] args) {
	add(10, 20);
	m1();
}
}
/*
 Output:-
 a. 30 1
 b. 30
 c. 1
 d. Compile Time Error
 Answer:-d 
 */
