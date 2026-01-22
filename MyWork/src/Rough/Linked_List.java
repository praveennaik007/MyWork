package Rough;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_List {
public static void main(String[] args) {
	LinkedList<Integer> li=new LinkedList();
	li.add(10);
	li.add(87);
	li.add(54);
	li.add(89);
//	li.add(Integer.MAX_VALUE);
 	li.add(40);
 	li.add(40);
 	li.add(401);
 	li.add(10);
 	li.add(4034);
	System.out.println(li);
//	li.remove();
//	System.out.println(li);
//	li.remove();
//	System.out.println(li);
//	li.remove();
//	System.out.println(li);
//	Collections.reverse(li);
//	System.out.println(li);
//	Collections.singleton(li);
//	System.out.println(li);
//	Collections.max(li);
//	System.out.println(li);
//	Collections.min(li);
//	System.out.println(li);
//	Collections.reverseOrder();
//	System.out.println(li);
//	Collections.shuffle(li);
//	System.out.println(li);
	Collections.sort(li);;
	System.out.println(li);
	
}
}
