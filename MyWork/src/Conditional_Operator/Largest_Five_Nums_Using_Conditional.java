package Conditional_Operator;

public class Largest_Five_Nums_Using_Conditional {
	public static void main(String[] args) {
		int a=100,b=20,c=30,d=70,e=50;
		System.out.println((a>b&&a>c&&a>d&&a>e)?a:(b>c&&b>d&&b>e)?b:(c>d&&c>e)?c:(d>e)?d:e);
		int x=a>b?a:b;
		int y=x>c?x:c;
		int z=y>d?y:d;
		int res=z>e?z:e;
		System.out.println(res);
		
	}
}
