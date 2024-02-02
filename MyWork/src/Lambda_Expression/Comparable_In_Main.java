package Lambda_Expression;

import java.util.ArrayList;


public class Comparable_In_Main {
public static void main(String[] args) {
	ArrayList<Comparable_In> al=new ArrayList<Comparable_In>();
	al.add(new Comparable_In("asd", 32, "male"));
	al.add(new Comparable_In("amd", 32, "female"));
	al.add(new Comparable_In("abd", 32, "male"));
	al.add(new Comparable_In("akd", 32, "female"));
	
	Comparable<Comparable_In> c=(obj)->{
		return obj.age;
	};
	
	
}
}
