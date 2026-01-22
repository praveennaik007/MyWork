package Comparator_Interface;

import java.util.*;

public class Comparator_Main {
	public static void main(String[] args) {
		Id id = new Id();
		Name name = new Name();
		Marks marks = new Marks();
		Course course=new Course();
		
		TreeSet<Student> al = new TreeSet<Student>(name);
		al.add(new Student(1, "Abc", 67.8, "cs"));
		al.add(new Student(5, "bbc", 76.8, "is"));
		al.add(new Student(2, "rbc", 87.8, "mca"));
		al.add(new Student(6, "fbc", 89.8, "it"));
		al.add(new Student(8, "cbc", 54.8, "eee"));
		al.add(new Student(7, "ebc", 98.8, "ece"));
		al.add(new Student(4, "dbc", 57.8, "civil"));
		al.add(new Student(3, "mbc", 74.8, "mech"));
		System.out.println(al);
		
		
		
		
		
		
//		TreeSet<Student> t=new TreeSet<Student>(al);
//		System.out.println("Based On Id :" + t);
//		System.out.println();
//		
//		TreeSet<Student> t1=new TreeSet<Student>(name);
//		System.out.println("Based On Name :" + t1);
//		System.out.println();
//		
//		TreeSet<Student> t2=new TreeSet<Student>(marks);
//		System.out.println("Based On Marks :" + t2);
//		System.out.println();
//		
//		TreeSet<Student> t3=new TreeSet<Student>(course);
//		System.out.println("Based On Course :" + t3);
	}
}
