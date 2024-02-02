package Manasa_Mam;

import java.util.Arrays;

public class Seperate_The_Digits_In_An_Array {
	public static void main(String[] args) {
		int nums[] = { 13, 25, 83, 77 };
		String str = "";
		for (int i = 0; i < nums.length; i++) {
			str += nums[i];
		}
		int st[] = new int[str.length()];
		for (int i = 0; i < st.length; i++) {
			st[i] = str.charAt(i) - 48;
		}
		// return st;
		System.out.println(Arrays.toString(st));
	}
}
