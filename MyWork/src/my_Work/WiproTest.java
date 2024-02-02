package my_Work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class WiproTest {
	public static void main(String[] args) {
		Double d = Math.random();
		System.out.println(d);// cannot say
		int i1 = 5;
		int i2 = 6;
		String s = "7";
		System.out.println(i1 + i2 + s);
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		s2 = "ghi";
		System.out.println(s1 + s2 + s3);
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j][i]);
			}
			System.out.println();
		}
		ArrayList<String> al = new ArrayList<String>();
		al.add("yellow");
		al.add("blue");
		al.add("orange");

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 10);
		hm.put(2, 10);
		hm.put(3, 30);
		hm.put(4, 40);
		hm.put(5, 50);
		System.out.println(hm);

		String str = "Hello World";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				System.out.print(str.charAt(i));
			}
		}
	}
}
