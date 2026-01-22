package HashMap_P;

import java.util.HashMap;

public class String_Unique {
	public static void main(String[] args) {
		String s = "preservatives";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (Character c : s.toCharArray()) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		for (Character st : hm.keySet()) {
			if (hm.get(st) == 1)
				System.out.print(st + " ");// p a t i
		}
	}
}
