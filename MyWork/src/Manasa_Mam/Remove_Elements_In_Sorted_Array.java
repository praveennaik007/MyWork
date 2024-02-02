package Manasa_Mam;

import java.util.Arrays;

public class Remove_Elements_In_Sorted_Array {
	public static void main(String[] args) {
		int nums[] = { 0,0,1,1,1,2,2};

		int i = 0;
		for (int j = i + 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				
				i++;
			}
			nums[i] = nums[j];
		}
		
		System.out.println(i+1);
	}
}
