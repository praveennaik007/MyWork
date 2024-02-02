package Manasa_Mam;

import java.util.Arrays;

public class Find_The_Middle_Index_In_Array {
	public static void main(String[] args) {
//		int nums[] = { 2, 3, -1, 8, 4 };
//		int sum=0;
//		int i=0;
//		for ( i = 0; i < nums.length; i++) {
//			if(i<=nums.length/2) {
//			sum+=nums[i];
//			}
//			
//		}
//		if(i-1==sum) {
//			System.out.println(i-1);
//		}
//		System.out.println(i-1);
//		System.out.println(sum);
		
		int[] a= {1,1,2,1,2,3,3};
		int c=0;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			int c1=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j] && i!=j) {
					c1++;
					
				}else {
					break;
				}
			}
			if (c1>0) {
				c++;
			}
		}
		System.out.println(c);
	}
}
