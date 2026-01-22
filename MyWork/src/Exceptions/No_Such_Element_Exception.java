package Exceptions;

import java.util.ArrayList;
import java.util.Iterator;

public class No_Such_Element_Exception {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(40);
		l.add(100);
		Iterator itr=l.iterator();
		System.out.println(itr.next());//10
		System.out.println(itr.next());//40
		System.out.println(itr.next());//100
		System.out.println(itr.next());//NoSuchElementException
	}

}
