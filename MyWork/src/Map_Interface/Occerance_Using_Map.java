package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Occerance_Using_Map {
	public static void main(String[] args) {
		String s = "the boy is good boy change in beast feature";
		Map<String, Integer> a = new HashMap();
		//char ch[]=s.toCharArray();
		String ch[] = s.split(" ");
		for (String c : ch) {
			if (a.containsKey(c)) {
				a.put(c, a.get(c) + 1);
			} else {
				a.put(c, 1);
			}
		}
		System.out.println(a);
	}
}
