package object_Class;

import java.util.Arrays;

//Internally Works
//	System.out.println((65 * 31 * 31) + (66 * 31) + (67));// ABC |64578
// Formula : hash = s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1];

public class GetHashValueof_Num_Char {

	public static void main(String[] args) {
		String s = "AB";
		char ch[] = s.toCharArray();

		int a[] = new int[ch.length];
		int c = count(a);
//		System.out.println(c);
		for (int i = 0; i < ch.length; i++) {
			a[i] = ch[i];
		}
		int res = 0;
		for (int i = 0; i < a.length; i++) {
			int pow = 1;
			for (int j = c; j >= 1; j--) {
				pow = pow * 31;
			}
			res = res + a[i] * pow;
			c--;
		}
		System.out.println(res);// 2081
//		hashCode value it generates internally Like This
		int x = 10;
		System.out.println(x + res);// 2091

	}

	public static int count(int n[]) {
		int count = 0;
		for (int i = 1; i < n.length; i++) {
			count++;
		}
		return count;
	}

}
