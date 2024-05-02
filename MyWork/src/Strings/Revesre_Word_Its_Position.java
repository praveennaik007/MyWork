package Strings;

public class Revesre_Word_Its_Position {
public static void main(String[] args) {
	String s="hello world hi to every one ";
	String str="";
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)!=' ') {
			str=s.charAt(i)+str;
		}else {
			System.out.print(str+" ");
			str="";
		}
	}
	System.out.println(str);
}
}
