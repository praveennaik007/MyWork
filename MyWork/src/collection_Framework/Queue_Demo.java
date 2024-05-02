package collection_Framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo {
public static void main(String[] args) {
	PriorityQueue<Character>  l=new PriorityQueue<>();
	l.add('a');
	l.add('b');
	l.add('c');
	l.add('d');
	l.add('a');
//	l.add(null);//NullPointerException
//	System.out.println(l);
//	System.out.println(l.poll());
	l.offer('g');
	System.out.println(l);
	l.remove('c');
	System.out.println(l);
	System.out.println(l.contains('d'));
	
	
//	System.out.println(l);
//	System.out.println(l.peek());
//	System.out.println(l.element());
//	System.out.println(l.remove(1));
	
	
	
	
}
}
