package HashMap_P;

import java.util.HashMap;

public class String_Occurrance {
	public static void main(String[] args) {
		String s = "helloworld";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (Character i : s.toCharArray()) {
			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i) + 1);
			} else {
				hm.put(i, 1);
			}
		}
		System.out.println(hm);// {r=1, d=1, e=1, w=1, h=1, l=3, o=2}

	}
}
