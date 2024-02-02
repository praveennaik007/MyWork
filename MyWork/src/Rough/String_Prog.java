package Rough;

import my_Work.SubString;

public class String_Prog {
	public static void main(String[] args) {
		String s = "START38 LTIME108 START38 LTIME108 START38";
		String str[] = s.split(" ");
		String st = "";
		int count ;
		int count1 ;
		for (int i = 0; i < str.length; i++) {
			count=0;
			count1=0;
			if (st.indexOf(str[i]) == -1) {
				
				for (int j = 0; j < str.length; j++) {
					if (str[i].length()-2==str[j].length()-2) {
						count++;
						
					}else {
						count1++;
						
					}
				}
					
			}
			st += str[i];
			System.out.println(count);
		}
		
		
	}
}
