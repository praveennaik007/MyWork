package Conditional_Operator;

public class Largest_7_Using_Conditional {
	public static void main(String[] args) {
		int a=10,b=20,c=30,d=40,e=50,f=60,g=70;
		System.out.println((a>b&&b>c&&a>d&&a>e&&a>f&&a>g)?a:(b>c&&b>d&&b>e&&b>f&&b>g)?b:(c>d&&c>e&&c>f&&c>g)?c:(d>e&&d>f&&d>g)?d:(e>f&&e>g)?e:(f>g)?f:g);
		int i=(a>b)?a:b;
		int j=(i>c)?i:c;
		int k=(j>d)?j:d;
		int l=(k>e)?k:e;
		int m=(l>f)?l:f;
		int n=(m>g)?m:g;
		System.out.println(n);
	}
}
