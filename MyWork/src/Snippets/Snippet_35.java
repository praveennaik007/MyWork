package Snippets;

public class Snippet_35 {
public static void main(String[] args) {
	int a=20;
	for(int i=a;i>=1;i-=5) {
		System.out.print(i+" ");
		i-=5;
	}
}
}
/*
 Output:-
 a. Compile Time Error
 b. 20 10
 c. 20 10 5
 d. 20 15 10 5
 Answer:-b 
 */
