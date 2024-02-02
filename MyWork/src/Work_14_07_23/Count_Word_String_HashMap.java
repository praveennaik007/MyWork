package Work_14_07_23;

import java.util.HashMap;

public class Count_Word_String_HashMap {
public static void main(String[] args) {
	String s="hello to every body good evening ";
	
	HashMap<String, String> hm=new HashMap<String, String>();
	int count=0;
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)==0||s.charAt(i)!=' '&& s.charAt(i)!=' ' || s.charAt(i-1)==' ') {

			count++;
			}
		}
		System.out.println(count);
}
}
