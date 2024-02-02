package collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class Student_Rank_Main {
	public static void main(String[] args) {
		ArrayList<Student_Rank> al = new ArrayList<Student_Rank>();
		al.add(new Student_Rank(3, "arun", 76.09));
		al.add(new Student_Rank(9, "bharath", 34.51));
		al.add(new Student_Rank(4, "chandra", 98.78));
		al.add(new Student_Rank(2, "arjun", 76.09));
		al.add(new Student_Rank(5, "bhramham", 76.09));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
//		int r = 1;
//		for (Student_Rank rank : al) {
//			rank.rank = r++;
//		}
//		System.out.println(al);
		
		ArrayList<Student_Rank> al1=new ArrayList<Student_Rank>();
		String vow="aeiouAEIOU";
		
		for (Student_Rank stu : al) {
			String name=stu.getName().charAt(0)+"";
			if(vow.contains(name)) {
				al1.add(stu);
			}
		}
		int r=1;
		for (Student_Rank stu : al1) {
			stu.setRank(r++);
		}
		System.out.println(al1);
	}
}
