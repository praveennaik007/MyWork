package Strings;

public class Duplicate_or_Frequency_Of_Char_Count_Another_Way {
public static void main(String[] args) {
	String s="hello world";
	for (int i = 0; i < s.length(); i++) {
		int count=0;
		for (int j = 0; j < s.length(); j++) {
			if(s.charAt(i)==s.charAt(j)&&i>j) {
				break;
			}
//			System.out.println(s.charAt(i)+"1");
//			System.out.println();
			if(s.charAt(i)==s.charAt(j)) {
				count++;
			}
//			System.out.println(s.charAt(i)+"2");
		}
		if(count>0&&s.charAt(i)!=' ') {
			System.out.print(s.charAt(i)+""+count+" ");
		}
	}
}
}
