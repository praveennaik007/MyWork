package Conditional_Operator;

public class Smallest_4_Nums_Using_Conditional {
	public static void main(String[] args) {
		int a=10,b=20,c=30,d=40;
		System.out.println((a<b&&a<c&&a<d)?a:(b<c&&b<d)?b:(c<d)?c:d);
		int x=(a<b)?a:b;
		int y=(x<c)?x:c;
		int z=(y<d)?y:d;
		System.out.println(z);
	}
}
