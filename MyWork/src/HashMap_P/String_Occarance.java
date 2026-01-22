package HashMap_P;

import java.util.*;
import java.util.Map.Entry;

public class String_Occarance {
public static void main(String[] args) {
	String s="This is a java class this is a java";
	String ch[]=s.split(" ");
	HashMap<String, Integer> hmap=new HashMap<String, Integer>();
	for (String c :ch ) {
		if(hmap.containsKey(c)) {
			hmap.put( c, hmap.get(c)+1);
		}
		else {
			hmap.put( c, 1);
		}
	}
	System.out.println(hmap);
}
}
