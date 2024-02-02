package Snippets;

public class Snippet_47 {
	public static void main(String[] args) {
//		int i = 3;
//		System.out.println(++i * 8);
		boolean flag=true;
		switch(flag) { //Cmpiletime Error
		case true:
		System.out.println("true");
		default:System.out.println("False");
		}
	}
}
