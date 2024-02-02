package Manasa_Mam;

import java.util.Arrays;

public class Merge_Two_Sorted_Array {
public static void main(String[] args) {
	int nums1[]= {1,2,3,0,0,0};
	int nums2[]= {2,5,6};
	int res=0;
	for (int i = 0; i < nums1.length; i++) {
		if(nums1[i]!=0) {
			res=nums1[i];
		}
	}
	System.out.println(res);
	int k=0;
	for (int i = res; i < nums1.length; i++) {
		if(i<res) {
			nums1[i]=nums1[i];
		}
		else {
			nums1[i]=nums2[k++];
		}
	}
	Arrays.sort(nums1);
	System.out.println(Arrays.toString(nums1));
}
}
