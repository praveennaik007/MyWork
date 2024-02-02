package Work_08_07_23;

public class Max_Vowel_Word_String {
public static void main(String[] args) {
	String s="java is a programming language";
	String str[]=s.split(" ");
	String vow="aeiouAEIOU";
	String st="";
	for (int i = 0; i < s.length()-1; i++) {
		if(s.charAt(i)==s.charAt(i+1)) {
			st+=s.charAt(i);
		}	
	}
	System.out.println(st);
}
}
