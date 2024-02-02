package collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Arraylist_Methods {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(40);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(50);
		System.out.println(al);

		Object[] a = al.toArray();
//		Object[] java.util.ArrayList.toArray();
		for (Object object : a) {
			System.out.println(object);
		}
		System.out.println();
		Object[] obj = al.toArray(a);
//		<Object> Object[] java.util.ArrayList.toArray(Object[] a);
		for (Object obj1 : obj) {
			System.out.println(obj1);
		}
		al.trimToSize();// Returns ArrayList
		//void java.util.ArrayList.trimToSize();
		System.out.println(al);
		 
		System.out.println(al.toString());
		//String java.util.AbstractCollection.toString();
		System.out.println(al.spliterator());
		//Spliterator<Integer> java.util.ArrayList.spliterator();
		System.out.println(al.size());
		al.set(2, 70);
		System.out.println(al);
		
		System.out.println(al.indexOf(50));
		//int java.util.ArrayList.indexOf(Object o);
		System.out.println(al.get(3));
		//Integer java.util.ArrayList.get(int index);
		System.out.println(al.clone());
		//Object java.util.ArrayList.clone();
		System.out.println(	al.hashCode());
		//int java.util.AbstractList.hashCode();
		System.out.println(	al.lastIndexOf(10));
//		int java.util.ArrayList.lastIndexOf(Object o;
		
	}
}
