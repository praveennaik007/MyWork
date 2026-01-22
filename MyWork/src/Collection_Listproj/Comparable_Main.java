package Collection_Listproj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Comparable_Main {
	public static void main(String[] args) {
		Comparable_In com1 = new Comparable_In(1, "hi", 25);
		Comparable_In com2 = new Comparable_In(3, "hello", 29);
		Comparable_In com3 = new Comparable_In(2, "bye", 22);
		Comparable_In com4 = new Comparable_In(5, "hye", 27);
		Comparable_In com5 = new Comparable_In(4, "byte", 24);

		ArrayList<Comparable_In> al = new ArrayList<Comparable_In>();
		al.add(com1);
		al.add(com2);
		al.add(com3);
		al.add(com4);
		al.add(com5);
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("*********************");
		ArrayList<Comparable_In> al1=new ArrayList<Comparable_In>();
		al1.add(new Comparable_In(2, "hi", 76));
		al1.add(new Comparable_In(5, "hello", 67));
		al1.add(new Comparable_In(3, "hye", 56));
		al1.add(new Comparable_In(1, "byee", 89));
		al1.add(new Comparable_In(4, "aeyyy", 99));
		Collections.sort(al1);
		System.out.println(al1);
	}

}
