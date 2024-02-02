package Manasa_Mam;

import java.util.Arrays;

public class Concatination_Array {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 1 };
		int c[] = new int[nums.length * 2];
		int x = 0;
		for (int i = 0; i < c.length; i++) {
			c[i] = nums[x++];
			if (i == nums.length - 1) {
				x = 0;
			}
		}
		// return c;
		System.out.println(Arrays.toString(c));
	}
}
