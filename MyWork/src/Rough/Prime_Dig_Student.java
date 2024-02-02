package Rough;

import java.util.Scanner;

public class Prime_Dig_Student {
	public static void main(String[] args) {
//	for(int i=1;i<=4;i++) {
//		for(int j=i;j<=4;j++) {
//			System.out.print(j);
//		}
//		System.out.println();
//	}
//	int n=91723,rem,count=0,res=0,p=10;
//	while(n>0) {
//		rem=n%10;
//		n/=10;
//		if(rem==0 || rem==1) {
//			count=count;
//		}
//		for(int i=2;i<=rem/2;i++) {
//			if(rem%i==0) {
//				count++;
//			}
//		}
//		if(count>0) {
//			res=p*rem+res;
//		}
//		p*=10;
//	}
//	System.out.println(res);

//	int num = 9526;
//	for (int i=1 ; i<=9 ; i++) {
//		for(int j=1 ; j <= num ; j++)
//		{
//			num= num%10;
//			System.out.println(num);
//			num/=10;
//			if (num%2==num)
//			{
//				System.out.println(num);
//			}
//			else {
//				System.out.println(num+"is not a prime number");
//			}
//		}
//	}

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0, m;
		while (n > 0) {
			// int rem = n % 10;
			m = minimum(n);
			sum = sum * 10 + m;
			n /= 10;
		}
		System.out.println("Ascending order:" + sum);
	}

	public static int minimum(int n) {
		int min = 9;
		while (n > 0) {
			int rem = n % 10;
			if (rem < min) {
				min = rem;
			}
			n /= 10;
		}
		return min;
	}
}
