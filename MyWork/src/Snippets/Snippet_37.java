package Snippets;

public class Snippet_37 
{
	void m1() 
	{
		System.out.println("From M1()"+" ");
	}
public static void main(String[] args) 
{
	Snippet_37 s=new Snippet_37();
	int n=10;
	if(n%2==0) 
	{
		System.out.print(n%2+" ");
	}
	s.m1();
}
}
/*
 * 
 Output:
 a. From m1()
 b. Compile Time Error
 c. 0 From M1()
 d. true 
 Answer : c
 */
