package collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Comparator_Main {
	public static void main(String[] args) {
		ArrayList<Comparator_Stu> al = new ArrayList<Comparator_Stu>();
		al.add(new Comparator_Stu(1, "Hi", 76.90));
		al.add(new Comparator_Stu(5, "Hello", 56.90));
		al.add(new Comparator_Stu(2, "hi", 96.90));
		al.add(new Comparator_Stu(4, "bye", 66.90));
		al.add(new Comparator_Stu(3, "Hey", 86.90));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String sname = sc.next();
//		if (sname.equalsIgnoreCase("id")) {
//			Collections.sort(al, new Comparator_Id());
//			for (Comparator_Stu comparator_Stu : al) {
//				System.out.println(comparator_Stu);
//			}
//		} else if (sname.equalsIgnoreCase("name")) {
//			Collections.sort(al, new Comparator_Name());
//			for (Comparator_Stu comparator_Stu : al) {
//				System.out.println(comparator_Stu);
//			}
//		} else if (sname.equalsIgnoreCase("marks")) {
//			Collections.sort(al, new Comparator_Marks());
//			for (Comparator_Stu comparator_Stu : al) {
//				System.out.println(comparator_Stu);
//			}
//		} else {
//			System.out.println("Not Found ");
//		}
		
		Comparator_Id id=new Comparator_Id();
		Comparator_Name name=new Comparator_Name();
		Comparator_Marks marks=new Comparator_Marks();
		
		if (sname.equalsIgnoreCase("id")) {
			Collections.sort(al, id);
			for (Comparator_Stu comparator_Stu : al) {
				System.out.println(comparator_Stu);
			}
		} else if (sname.equalsIgnoreCase("name")) {
			Collections.sort(al, name);
			for (Comparator_Stu comparator_Stu : al) {
				System.out.println(comparator_Stu);
			}
		} else if (sname.equalsIgnoreCase("marks")) {
			Collections.sort(al, marks);
			for (Comparator_Stu comparator_Stu : al) {
				System.out.println(comparator_Stu);
			}
		} else {
			System.out.println("Not Found ");
		}
//		Comparator_Id id=new Comparator_Id();
//		Comparator_Name name=new Comparator_Name();
//		Comparator_Marks marks=new Comparator_Marks();
//		Collections.sort(al,id);
//		for (Comparator_Stu comparator_Stu : al) {
//			System.out.println(comparator_Stu);
//		}
//		System.out.println("************");
//		Collections.sort(al,name);
//		for (Comparator_Stu comparator_Stu : al) {
//			System.out.println(comparator_Stu);
//		}
//		System.out.println("************");
//		Collections.sort(al,marks);
//		for (Comparator_Stu comparator_Stu : al) {
//			System.out.println(comparator_Stu);
//		}
	}
}
