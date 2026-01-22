package HashMap_P;

import java.util.HashMap;

public class String_Print_Duplicates {
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
		for (Character ch : hm.keySet()) {
			if (hm.get(ch) > 1) {
				System.out.print(ch + " ");
			}
		}
	}
}
