package my_Work;

import java.util.Arrays;

public class Array_Program_Print_Individual_Digits {
	public static void main(String[] args) {
		int a[] = { 100, 20, 1, 5, 30 };
		String s = "";

		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		int n[] = new int[s.length()];
		for (int j = 0; j < n.length; j++) {
			n[j] = s.charAt(j)-48;
		}

		System.out.println(Arrays.toString(n));
	}

}
