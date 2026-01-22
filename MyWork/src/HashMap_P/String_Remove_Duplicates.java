package HashMap_P;

import java.util.HashMap;

public class String_Remove_Duplicates {
	public static void main(String[] args) {
		String s = "javaProgramming";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (Character st : s.toCharArray()) {
			if (hm.containsKey(st)) {
				hm.put(st, hm.get(st) + 1);
			} else {
				hm.put(st, 1);
			}
		}
		for (Character str : hm.keySet()) {
			System.out.print(str + " ");// P a r v g i j m n o
		}
	}
}
