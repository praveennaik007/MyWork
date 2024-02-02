package collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class AList {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(20);
	Iterator itr=al.iterator();
	System.out.println(itr.next());
	System.out.println(itr.next());
	System.out.println(itr.next());
}
}
