package Tree_Set_Map;

import java.util.TreeMap;

public class Tree_Map {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "B");
		tm.put(4, "A");
		tm.put(2, "D");
		tm.put(5, "C");
		tm.put(3, "E");
		System.out.println(tm);
		System.out.println(tm.get(3));
//		System.out.println(tm.pollFirstEntry());
//		System.out.println(tm.pollLastEntry());
		System.out.println(tm.firstEntry());
		System.out.println(tm.firstKey());
		System.out.println(tm.ceilingKey(3));
		System.out.println(tm.ceilingEntry(2));

	}
}
