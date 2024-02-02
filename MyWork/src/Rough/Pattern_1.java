package Rough;

public class Pattern_1 {
//public static void main(String[] args) {
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=5;j++) {
//			if(i==1 ||i==5||j==1||j==5) {
//				System.out.print("*");
//			}
//			else if(i==3&&j==3) {
//				System.out.print("$");
//			}
//			else{
//				System.out.print("@");
//			}
//		}
//		System.out.println();
//	}
//}
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
			n/=10;
		}
		System.out.println(sum);
	}
}
