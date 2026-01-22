package Collection_Setpack;

import java.util.TreeSet;

public class TreeSet_Comp implements Comparable<TreeSet_Comp> {
	int id;
	String name;
	int sal;

	public TreeSet_Comp(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "TreeMap_Comp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(TreeSet_Comp o) {
		if (this.sal < o.sal)
			return 1;
		if (this.sal > o.sal)
			return -1;
		return 0;
	}

}
