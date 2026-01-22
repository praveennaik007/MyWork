package Collection_Setpack;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSet_Comp_Sec_Max_Main {
	public static void main(String[] args) {
		TreeSet<TreeSet_Comp> ts = new TreeSet<TreeSet_Comp>();
		ts.add(new TreeSet_Comp(1, "Rakesh", 12000));
		ts.add(new TreeSet_Comp(2, "Ramesh", 9000));
		ts.add(new TreeSet_Comp(3, "abhi", 10000));
		ts.add(new TreeSet_Comp(4, "Arm", 15000));
		ts.add(new TreeSet_Comp(5, "Cat", 13000));
		for (TreeSet_Comp obj : ts) {
			System.out.println(obj);
		}

	}
}
