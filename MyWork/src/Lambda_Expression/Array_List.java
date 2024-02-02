package Lambda_Expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Array_List {
public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(30);
	l.add(40);
	l.add(20);
	l.add(50);
	System.out.println(l);
	Collections.sort(l);
	Comparator<Integer> c=(i1,i2)->{
		return (i1<i2)?-1:(i1>i2)?1:0;
	};
	System.out.println(l);
	
}
}
