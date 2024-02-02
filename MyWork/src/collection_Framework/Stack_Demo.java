package collection_Framework;

import java.util.Stack;

public class Stack_Demo {
	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();
		s.push('A');//To Insert push()
		s.push('B');
		s.push('C');
		s.push('D');
		System.out.println(s);
		System.out.println(s.search('D'));
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s);
	}
}
