package Collection_Queueproj;

import java.util.PriorityQueue;

public class Priority_Queue {
	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(20);
		p.add(15);
		p.add(30);
		p.add(40);
		p.add(10);
		p.add(50);
		p.add(35);
		System.out.println(p);
	}
}
