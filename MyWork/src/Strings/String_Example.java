package Strings;

public class String_Example {
public static void main(String[] args) {
String s1="Hello world Hi To Java";
//System.out.println(s1.toLowerCase());
//System.out.println(s1.toUpperCase());
//System.out.println(s1.toCharArray());
//char ch[]=s1.toCharArray();
//System.out.println(ch);
//System.out.println(s1.charAt(3));
//System.out.println();
String st[]=s1.split("%",3);
for (int i = 0; i < st.length; i++) {
	System.out.print(st[i]);
}
}
}
