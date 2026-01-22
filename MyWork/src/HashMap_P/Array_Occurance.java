package HashMap_P;

import java.util.HashMap;

public class Array_Occurance {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 4, 7, 2, 8 };
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i : a) {
			if (hmap.containsKey(i)) {
				hmap.put(i, hmap.get(i) + 1);
			} else {
				hmap.put(i, 1);
			}
		}
		System.out.println(hmap);

	}

}
