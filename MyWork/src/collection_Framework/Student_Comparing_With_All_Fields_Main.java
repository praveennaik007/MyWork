package collection_Framework;

import java.util.ArrayList;
import java.util.Collections;


public class Student_Comparing_With_All_Fields_Main {
	public static void main(String[] args) {
		ArrayList<Student_Comparing_With_All_Fields> al = new ArrayList<Student_Comparing_With_All_Fields>();
		al.add(new Student_Comparing_With_All_Fields(2, "a", 89.76));
		al.add(new Student_Comparing_With_All_Fields(4, "b", 98.76));
		al.add(new Student_Comparing_With_All_Fields(1, "a", 89.76));
		al.add(new Student_Comparing_With_All_Fields(3, "d", 56.76));
		al.add(new Student_Comparing_With_All_Fields(5, "b", 34.76));
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
	}
}
