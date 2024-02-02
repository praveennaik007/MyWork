package Manasa_Mam;

import java.util.ArrayList;
import java.util.Arrays;

public class Single_Number3 {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 1, 3, 2, 5 };
//		ArrayList<Integer> res = new ArrayList();
//		for (int i = 0; i < nums.length; i++) {
//			int count = 0;
//			for (int j = 0; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					count++;
//				}
//			}
//			if (count == 1) {
//				res.add(nums[i]);
//			}
//		}
//		int[] z = new int[res.size()];
//		for (int i = 0; i < z.length; i++) {
//			z[i] = res.get(i);
//		}
//		// return z;
//		System.out.println(Arrays.toString(z));
		
		System.out.println();
		
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				res++;
			}
		}
		int x[] = new int[res];
		int ind = 0;
		for (int i = 0; i < nums.length; i++) {
			int count1 = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count1++;
				}
			}
			if (count1 == 1) {
				x[ind++] = nums[i];
			}
		}
		// return x ;
		System.out.println(Arrays.toString(x));
	}
}
