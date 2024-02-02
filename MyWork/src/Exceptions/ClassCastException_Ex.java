package Exceptions;

import java.util.TreeSet;

public class ClassCastException_Ex {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add("hi");
	}

}
