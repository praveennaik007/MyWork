package Strings;

public class Print_aaabbc_to_a3b2c3_String {
public static void main(String[] args) {
	String s="aaabbc";
	String str="";
	for (int i = 0; i < s.length(); i++) {
		int count=0;
		for (int j = 0; j < s.length(); j++) {
			if(s.charAt(i)==s.charAt(j)) {
				count++;
			}
		}
		
		str+=count;
	}
	System.out.println(str);
}
}
