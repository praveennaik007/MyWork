package Collection_Listproj;

import java.util.*;

public class Iterator_Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(35);
		al.add(40);
		al.add(57);
		al.add(60); 
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if (i % 2 != 0) {
				itr.remove();
			}
		}
		System.out.println(al);
	}
}
