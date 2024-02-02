package collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Class {
public static void main(String[] args) {
//	LinkedList li=new LinkedList();
//	li.add(10);
//	li.add(20);
//	li.add(30);
//	li.add(40);
//	li.add(50);
//	System.out.println(li);
//	li.add(4, 2);
//	System.out.println(li);
//	System.out.println("===Four Ways To Access The Object Elements===");
//	for (int i = 0; i < li.size(); i++) {
//		System.out.println(li.get(i));
//	}
//	System.out.println();
//	Iterator itr=li.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
//	System.out.println();
//	ListIterator l=li.listIterator();
//	while(l.hasNext()) {
//		System.out.println(l.next());
//	}
//	System.out.println();
//	for (Object obj : li) {
//		System.out.println(obj);
//	}
	LinkedList ln=new LinkedList();
	ln.add(10);
	System.out.println(ln);
	ln.add(1, 30);
	System.out.println(ln);
	ln.addFirst(400);
	System.out.println(ln);
	ln.addLast(1000);
	System.out.println(ln);
	System.out.println(ln.element());
	System.out.println(ln.get(2));	
	System.out.println(ln.getFirst());
	System.out.println(ln.getLast());
	System.out.println(ln.indexOf(30));
	System.out.println(ln.lastIndexOf(1000));
	System.out.println(ln.offer("str"));
	System.out.println(ln);
	System.out.println(ln.offerFirst("Hello"));
	System.out.println(ln);
	System.out.println(ln.offerLast("hi"));
	System.out.println(ln);
	System.out.println(ln.removeFirst());
	System.out.println(ln.removeLast());
	System.out.println(ln.removeFirstOccurrence(1000));
	System.out.println(ln);
	System.out.println(ln.removeLastOccurrence(30));
	System.out.println(ln);
	ln.set(2, 500);
	System.out.println(ln);
	ln.add(2, "hmm");
	System.out.println(ln);
	
}
}