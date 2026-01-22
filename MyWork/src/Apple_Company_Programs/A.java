package Apple_Company_Programs;

import java.util.ArrayList;
import java.util.List;

public class A {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Orange");
		al.add("Banana");
		al.add("mango");
		al.add("orange");
		al.add("banana");
		al.add("Orange");
		al.add("grapes");
		al.add("Banana");
		System.out.println(fruit(al));
	}

	public static List<String> fruit(List<String> index) {
		List<String> res = new ArrayList<String>();
		for (int i = 0; i < index.size(); i++) {
			boolean rs = false;
			for (int j = 0; j < res.size(); j++) {
				if (index.get(i).equals(res.get(j))) {
					rs = true;
					break;
				}
			}
			if (!rs) {
				res.add(index.get(i));
			}
		}
		return res;
	}
}
