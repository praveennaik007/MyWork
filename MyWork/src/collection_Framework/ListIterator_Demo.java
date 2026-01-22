package collection_Framework;

import java.util.*;

public class ListIterator_Demo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Bananna");
		al.add("Custured Apple");
		al.add("Mango");
		al.add("Grapes");
		ListIterator<String> itr = al.listIterator();
		while (itr.hasNext()) {
			Object o = itr.next();
			if (itr.nextIndex() == 1) {
				itr.add("Pine Apple");
			}
			
		}
		itr.set("Orange");
		System.out.println(al);
	}
}
