package Array_One_D;

import java.util.Arrays;

//Store Ascii values of each char of the given String in an Array
public class Ascii_Values_Each_char {
	public static void main(String[] args) {
		String s = "Hello";
		char ch[] = s.toCharArray();
		int k[] = new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			k[i] = ch[i];
		}
		System.out.println(Arrays.toString(k));

	}
}
