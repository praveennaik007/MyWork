package Rough;

import java.util.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Ex {
	public static void main(String[] args) {
//		Queue<Integer> p = new PriorityQueue<Integer>();
//		p.add(90);
//		p.add(20);
//		p.add(40);
//		p.add(30);
//		p.add(80);
//		System.out.println(p);
		
//		p.poll();
//		System.out.println(p);
//		p.poll();
//		System.out.println(p);
//		p.poll();
//		System.out.println(p);
		
		Queue<Integer> p1 = new PriorityQueue<Integer>();
		p1.add(98);
		p1.add(12);
		p1.add(46);
		p1.add(30);
		p1.add(5);
		System.out.println(p1);
		
		Queue<Integer> p2 = new PriorityQueue<Integer>(p1);
		p2.add(90);
		p2.add(20);
		p2.add(40);
		p2.add(36);
		p2.add(80);
		System.out.println(p2);
	}
}
