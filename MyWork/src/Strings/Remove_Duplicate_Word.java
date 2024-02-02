package Strings;

public class Remove_Duplicate_Word {
public static void main(String[] args) {
	String s="This is a a class is is is ";
	String s1="is";
	for (int i = 0; i < s.length(); i++) {
		String word="";
		while(i<s.length()&&s.charAt(i)!=' ') {
			word+=s.charAt(i);
			i++;
		}
		if(!word.equals(s1)) {
			System.out.print(word+" ");
		}	
//		if(word.equals(s1)) {
//			System.out.print(word+" ");
//		}	
	}
	
}
}
