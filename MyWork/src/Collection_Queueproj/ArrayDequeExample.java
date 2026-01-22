package Collection_Queueproj;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	public static void main(String[] args) {
		Deque<String> s = new ArrayDeque<String>();
		s.push("mango");
		s.push("banana");
		s.push("orange");
		s.push("grapes");		
		s.push("papaya");
		System.out.println(s);// [papaya, grapes, orange, banana, mango]
//		System.out.println(s.element());// papaya

//		ADDING ELEMENT TO THE EMPTY DEQUE
//		s.addFirst("pineApple");
//		System.out.println(s);// [pineApple]
//		s.addLast("mango");
//		System.out.println(s);// [mango]
//		s.offerFirst("Apple");
//		System.out.println(s);// [Apple]

//		REMOVING ELEMENTS FROM EMPTY DEQUE
//		s.poll();
//		System.out.println(s);// []
//		s.pollFirst();
//		System.out.println(s);// []
//		s.pollLast();
//		System.out.println(s);// []
//		s.remove();
//		System.out.println(s);//NoSuchElementException
//		s.removeFirst();
//		System.out.println(s);// NoSuchElementException
//		s.removeLast();
//		System.out.println(s);// NoSuchElementException

//		ACCESSING EMPTY DEQUE
//		System.out.println(s.peek());// null
//		System.out.println(s.peekFirst());// null
//		System.out.println(s.peekLast());// null
//		System.out.println(s.getFirst());// NoSuchElementException
//		System.out.println(s.getLast());// NoSuchElementException

//		ADDING ELEMENTS FROM DEQUE

//		s.addFirst("Guvvava");
//		System.out.println(s);// [Guvvava, papaya, grapes, orange, banana, mango]

//		s.addLast("Apple");
//		System.out.println(s);// [papaya, grapes, orange, banana, mango, Apple]

//		s.offerFirst("Avacado");
//		System.out.println(s);// [Avacado, papaya, grapes, orange, banana, mango]

//		s.offerLast("Berry");
//		System.out.println(s);// [papaya, grapes, orange, banana, mango, Berry]

//		REMOVING ELEMENTS FROM THE DEQUE

//		s.remove();
//		System.out.println(s);//[grapes, orange, banana, mango]
//		or
//		s.removeFirst();
//		System.out.println(s);// [grapes, orange, banana, mango]

//		s.removeLast();
//		System.out.println(s);// [papaya, grapes, orange, banana]

//		s.poll();
//		System.out.println(s);// [grapes, orange, banana, mango]

//		s.pollFirst();
//		System.out.println(s);// [grapes, orange, banana, mango]

//		s.pollLast();
//		System.out.println(s);// [papaya, grapes, orange, banana]

//		s.pop();
//		System.out.println(s);// [grapes, orange, banana, mango]

//		ACCESSING ELEMENTS FROM DEQUE

//		System.out.println(s.peek());// papaya
//		System.out.println(s.peekFirst());// papaya
//		System.out.println(s.peekLast());// mango
//		System.out.println(s.getFirst());// papaya
//		System.out.println(s.getLast());// mango

	}
}
