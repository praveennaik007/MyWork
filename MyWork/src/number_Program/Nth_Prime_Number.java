

package number_Program;

import java.util.Scanner;

public class Nth_Prime_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int count1=0;
		for (int i = 1; true; i++) {
			int count=0;
			for (int j = 1; j <= i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				count1++;
			}
			if(count1==n) {
				System.out.println(i);
				break;
			}
		}
		
		
	}
}
