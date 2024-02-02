package Exceptions;

import java.util.ArrayList;
import java.util.Iterator;

public class No_Such_Element_Exception {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		Iterator itr=l.iterator();
		System.out.println(itr.next());
	}

}
