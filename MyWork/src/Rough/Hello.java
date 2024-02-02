package Rough;


public class Hello {
public static void main(String[] args) {
	int n=23514;int sum=0;
	int temp=n;
	int count=0;
	while(n!=0) {
		n/=10;
		count++;
	}
	while(temp!=0) {
		int d=temp%10;
		int pow=1;
		for(int i=1;i<=count;i++) {
			pow*=d;
		}
		sum+=pow;
		temp/=10;
	}
	System.out.println(sum);
}
}
