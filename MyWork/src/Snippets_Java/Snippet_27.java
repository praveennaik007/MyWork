package Snippets_Java;

public class Snippet_27 {
public static void main(String[] args) {
	int a=5;
	if(a<=4) {
		System.out.print(a+" ");
		if(a<=10)
			System.out.print(a+a+" ");
			System.out.print(a*a+" ");
			else {
				System.out.println(a+" ");
			}
	}
	else {
		System.out.println((a+a)+" ");
	}
}
}

/*
Output:-
a. 5 10 25
b. 5
c. 10
d. Compile Time Error
Answer:- d
*/
