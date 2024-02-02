package Snippets;

public class Snippet_16 {
	static {
		System.out.println("3");
	}
	 Snippet_16() {
		System.out.println("2");
	}
	{
	System.out.println("1");	
	}
	Snippet_16(int a){
		this();
		System.out.println("4");
	}
public static void main(String[] args) {
	new Snippet_16(4);
	new Snippet_16();
}
}

/*
  Output:
 a. Compile Time Error
 b. 3 2 1 4 1 2
 c. 3 1 2 4 1 2
 d. 3 4 1 2 1 2
 Answer:c
 */




