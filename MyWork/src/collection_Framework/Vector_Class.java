package collection_Framework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Class {
	public synchronized void hi() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.println(v);
		// 5 ways to Access the Elements
		Enumeration en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println();
		Enumeration e = v.elements();
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println();
		Iterator itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		ListIterator li = v.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println();
		for (Object obj : v) {
			System.out.println(obj);
		}
		System.out.println("===Four Overloaded Constructors===");
		System.out.println("1. Default Constructor ");
		Vector v1 = new Vector();
		v1.add(20);
		v1.add(20);
		v1.add(10);
		v1.add(30);
		v1.add(40);
		System.out.println(v1);
		System.out.println("2. Passing Collection into Constructor");
		Vector vc = new Vector(v);
		System.out.println(vc.size());
		System.out.println(vc);
		System.out.println("3. Passing Intial Capacity ");
		Vector vct = new Vector(10);
		vct.add(100);
		vct.add(200);
		vct.add(300);
		vct.add(400);
		vct.add(500);
		System.out.println(vct.size());
		System.out.println(vct);
		System.out.println("4. Passing Intial, Incrimental Capacity ");

		Vector vctr = new Vector(0, 2);
		vctr.add(11);
		vctr.add(12);
		vctr.add(13);
		vctr.add(14);
		vctr.add(15);
		vctr.add(16);
		System.out.println(vctr.size());
		System.out.println(vctr);
	}
}
