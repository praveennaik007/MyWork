package Snippets_Java;

public class Snippet_28 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++)
			if (i > 5)
				break;
			else if(i < 10)
				System.out.print(i + " ");
			else
				System.out.print("End");
	}
}
/*
Output:- 
a. 1 2 3 4 5
b. 6 7 8 9 10
c Compile Time Error
d. 1 2 3 4 5 End
Answer:-a
*/
