package Manasa_Mam;

import java.util.Arrays;

public class Search_Insert_Position {
public static void main(String[] args) {
	int nums[]= {1,2,3,4,5};
	int target=6;
	System.out.println(searchInsert(nums, target));
}
public static int searchInsert(int []nums,int target) {
	Arrays.sort(nums);
	int i;
	for ( i = 0; i < nums.length; i++) {
		if(nums[i]==target) {
				break;
			}
			else if(nums[i]>target) {
				break;
			}
		}
	return i;
}
}
