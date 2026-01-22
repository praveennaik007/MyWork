package Collection_Setpack;

import java.util.HashSet;
import java.util.Set;

public class Collection_String {
public static void main(String[] args) {
	String str[]= {"hello","hello","hi","hm","hello","hi","he"};
	HashSet s=new HashSet();
	for (int i = 0; i < str.length; i++) {
		if(s.contains(str)==false) {
			s.add(str[i]);
		}
	}
	System.out.println(s);
	
}
}
