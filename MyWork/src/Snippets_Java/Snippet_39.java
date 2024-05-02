package Snippets_Java;

public class Snippet_39 {
public static void main(String[] args) {
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <=i; j++) {
			if(j%i==0) {
				System.out.print(i);
			}
		}
	}
}
}
/*
 Output:
 a. 12345
 b. 122334455
 c. Compile Time Error
 d. No Error
 Answer : a
 */