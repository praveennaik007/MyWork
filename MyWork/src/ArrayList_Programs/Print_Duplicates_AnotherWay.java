package ArrayList_Programs;

import java.util.ArrayList;

public class Print_Duplicates_AnotherWay {
	
	public static void main(String[] args) {
		int a[] = { -1, 2, 3, 4, 2, 3, 4, -1, 1, 5, 6, 1, 9, 2 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			al.add(a[i]);
		}
		for (int i = 0; i < al.size(); i++) {
			int count = 1;
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i) == al.get(j)) {
					count++;
					al.set(j, Integer.MAX_VALUE);
				}
			}
			if (al.get(i) != Integer.MAX_VALUE && count > 1) {
				System.out.println(al.get(i) + "=>" + count);
			}
		}
		System.out.println(Integer.MAX_VALUE);
	}
}
