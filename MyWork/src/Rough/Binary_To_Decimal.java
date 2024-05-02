package Rough;

public class Binary_To_Decimal {
public static void main(String[] args) {
	int bin=10000;
	int dec=0,pow=1;
	while(bin>0) {
		int d=bin%10;
		dec=dec+d*pow;
		pow=pow*2;
		bin/=10;
	}
	System.out.println(dec);
}
}
