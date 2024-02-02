package my_Work;

import java.util.Arrays;

public class Count_The_Duplicate_Words_String {
	public static void main(String[] args) {
		String s = "hi hello hi hello hi hm";
		String str[]=s.split(" ");
		int count = 0;
		for (int i = 0; i < str.length; i++) {
		if(i==0&&s.charAt(i)!=' '||s.charAt(i)!=' '&&s.charAt(i-1)==' ') {
			count++;
			}
		
		}
		System.out.println(count);
	}
}
