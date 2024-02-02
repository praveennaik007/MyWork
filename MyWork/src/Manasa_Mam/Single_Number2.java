package Manasa_Mam;

import java.util.Arrays;

public class Single_Number2 {
	public static void main(String[] args) {
		int nums[] = { 0, 1, 0, 1, 0, 1, 99 };
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				//res = nums[i];
				System.out.println(nums[i]);
			}
		}
		//return res;
	}
}
