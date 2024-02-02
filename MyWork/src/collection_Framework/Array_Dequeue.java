package collection_Framework;

import java.util.ArrayDeque;

public class Array_Dequeue {
	public static void main(String[] args) {
		ArrayDeque a = new ArrayDeque();
		a.add(1);
		a.add(2);
		a.add(9);
		a.add(4);
		a.add(5);
		a.add(6);
//		a.peekFirst();
		a.peekLast();
		System.out.println(a);
		a.poll();
		System.out.println(a);

	}
}
