package Snippets_Java;

public class Snippet_38 {
	int i=10;
	Snippet_38(String s){
		super(10);
	}
	public Snippet_38() {
		this("hi");
	}		
public static void main(String[] args) {
	Snippet_38 s=new Snippet_38();
	System.out.println(s.i);
}
}
/*
 Output:
 a. 10
 b. Compile Time Error
 c. No Error
 d.  RunTime Error
 Answer : b
 */
