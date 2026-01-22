package Comparable_Interface;

import java.util.ArrayList;
import java.util.Collections;

public class Student_Main {
public static void main(String[] args) {
	// One Way
//	Student s1=new Student(1, "ABC", 78.98);
//	Student s2=new Student(5, "CBC", 71.98);
//	Student s3=new Student(2, "EBC", 77.98);
//	Student s4=new Student(6, "UBC", 72.98);
//	Student s5=new Student(7, "CBC", 75.98);
//	Student s6=new Student(4, "KBC", 73.98);
//	Student s7=new Student(3, "FBC", 76.98);
//	ArrayList<Student> al=new ArrayList<Student>();
//	al.add(s1);
//	al.add(s2);
//	al.add(s3);
//	al.add(s4);
//	al.add(s5);
//	al.add(s6);
//	al.add(s7);
//	Collections.sort(al);
//	System.out.println(al);
	
	// 		Another Way
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(new Student(1, "ABC", 78));
	al.add(new Student(5, "BC", 73));
	al.add(new Student(7, "AC", 77));
	al.add(new Student(3, "AB", 79));
	al.add(new Student(6, "C", 74));
	al.add(new Student(2, "AGC", 72));
	al.add(new Student(4, "EDC", 75));
	Collections.sort(al);
	System.out.println(al);
	}
}
