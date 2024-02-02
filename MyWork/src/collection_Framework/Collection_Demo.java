package collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Collection_Demo {
public static void main(String[] args) {
	Collection c=new ArrayList();
	List al=new ArrayList();
	ArrayList a=new ArrayList();
	al.add(10);
	al.add("hi");
	al.add(20);
	al.add('c');
	al.add(40);
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	Vector v=new Vector();
	v.add(10);
	v.add(10);
	v.add(10);
	Enumeration e=v.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	Enumeration en=new Enumeration() {

		@Override
		public boolean hasMoreElements() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object nextElement() {
			// TODO Auto-generated method stub
			return null;
		}
	};
}
}
