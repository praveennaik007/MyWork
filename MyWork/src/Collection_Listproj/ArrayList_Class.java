package Collection_Listproj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayList_Class {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	ArrayList al1=new ArrayList(1);
	al1.add(10);
	al1.add(20);
	al1.add(30);
	al1.add(40);
	al1.add(50);
	System.out.println(l.subList(0, 2));
	l.toArray();
	System.out.println(l);

	int a[]= {1,2,3,4,5};
//	System.out.println(l);
//	System.out.println("===Four Ways To Access The Object Elements===");
//	for (int i = 0; i < l.size(); i++) {
//		System.out.println(l.get(i));
//	}
//	System.out.println();
//	Iterator itr=l.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
//	System.out.println();
//	ListIterator li=l.listIterator();
//	while(li.hasNext()) {
//		System.out.println(li.next());
//	}
//	System.out.println();
//	for (Object obj : l) {
//		System.out.println(obj);
//	}
	
//	List lis=new List() {
//		@Override
//		public boolean add(Object arg0) {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//		@Override
//		public void add(int arg0, Object arg1) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public boolean addAll(Collection arg0) {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//		@Override
//		public boolean addAll(int arg0, Collection arg1) {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//		@Override
//		public void clear() {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public boolean contains(Object arg0) {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//		@Override
//		public boolean containsAll(Collection arg0) {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//		@Override
//		public Object get(int arg0) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public int indexOf(Object arg0) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//
//		@Override
//		public boolean isEmpty() {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//		@Override
//		public Iterator iterator() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public int lastIndexOf(Object arg0) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//
//		@Override
//		public ListIterator listIterator() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public ListIterator listIterator(int arg0) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public boolean remove(Object arg0) {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//		@Override
//		public Object remove(int arg0) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public boolean removeAll(Collection arg0) {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//		@Override
//		public boolean retainAll(Collection arg0) {
//			// TODO Auto-generated method stub
//			return false;
//		}
//
//		@Override
//		public Object set(int arg0, Object arg1) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public int size() {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//
//		@Override
//		public List subList(int arg0, int arg1) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public Object[] toArray() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public Object[] toArray(Object[] arg0) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//	};
//	System.out.println("Three Overloaded Constructors ");
//	ArrayList al=new ArrayList(l);
//	System.out.println(al);
//	System.out.println();
//	
//	System.out.println(al1);
	Collection c=new Collection() {

		@Override
		public boolean add(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean addAll(Collection arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean contains(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsAll(Collection arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterator iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean remove(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] toArray(Object[] arg0) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
//	Collection c1=new ArrayList();
//	c1.add(10);
//	c1.add(10);
//	c1.add(10);
//	c1.add(10);
//	System.out.println(c1);
//	
//	Collection c2=new Vector();
//	c2.add(10);
//	c2.add(10);
//	c2.add(10);
//	c2.add(10);
//	c2.add(10);
//	System.out.println(c2);
//	
//	Collection c3=new LinkedList();
//	c3.add(10);
//	c3.add(20);
//	c3.add(30);
//	c3.add(40);
//	c3.add(50);
//	c3.add(60);
//	System.out.println(c3);
}
}
