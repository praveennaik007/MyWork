package Strings;

public class Remove_Duplicates_String {
public static void main(String[] args) {
	String s="hellobye bye bye bye hello hello ";
	String str[]=s.split(" ");
	String st="";
	for (int i = 0; i < str.length; i++) {
		int count=0;
		for (int j = i+1; j < str.length; j++) {
			if(str[i]!=str[j]) {
				count++;
				break;
			}
		}
		if(count>=1) {
			System.out.println(str[i]);
		}
	}
}
}
