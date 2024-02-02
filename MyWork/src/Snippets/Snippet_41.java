package Snippets;
class Parent
{
	int a=40;
	public void name() 
	{
		System.out.println();
	}
}
public class Snippet_41  extends Parent
{
	int a=90;
	static int b=555;
	public void name() 
	{
		int a=99;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) 
	{
		int b=5;
		System.out.println(Snippet_41.b+b);
		String m="hello\"world\"";
		System.out.println(m);
	}
}
