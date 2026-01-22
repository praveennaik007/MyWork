package Tree_Set_Map;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

import Rough.Next_Prime;

public class TreeSet_Ex {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(110);
		t.add(20);
		t.add(11);
		t.add(43);
		t.add(67);
		t.add(87);
		t.add(123);
		System.out.println(t);
		// it gives the next immediate nearest object 
		System.out.println(t.ceiling(8));
		
		System.out.println(t.contains(67));
		t.descendingIterator();
		t.descendingSet();
		System.out.println(t.first());
		t.remove(87);
		System.out.println(t);
		t.floor(123);
		System.out.println(t);
		System.out.println(t.last());
		System.out.println(t.pollFirst());
		System.out.println(t);
		System.out.println(t.pollLast());
		System.out.println(t);
		System.out.println(t.lower(110));
		System.out.println(t.higher(11));
		System.out.println(t.floor(50));
		System.out.println(t.ceiling(50));
		System.out.println("**********************");
		Iterator<Integer> itr = t.descendingIterator();
	
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
