package my_Work;

import java.util.Arrays;

public class TocharArray_Implementation {
public static void main(String[] args) {
	String s="hello";
	char ch[]=new char[s.length()];
	for(int i=0;i<ch.length;i++) {
		ch[i]=s.charAt(i);
	}
	System.out.println(Arrays.toString(ch));
}
}
