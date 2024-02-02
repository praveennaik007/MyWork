package Manasa_Mam;

public class Fin_The_Middle_Index_In_Array {
	public static void main(String[] args) {
		int nums[] = { 2, 3, -1, 8, 4 };
		int totalsum = 0;
		int leftsum = 0;
		for (int i = 0; i < nums.length; i++) {
			totalsum += nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			if (2 * leftsum == totalsum - nums[i]) {
				// return i;
				System.out.println(i);
			}
			leftsum += nums[i];
		}
		// return -1;
		System.out.println(-1);
	}
}
