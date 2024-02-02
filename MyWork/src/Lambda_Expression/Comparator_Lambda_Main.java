package Lambda_Expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Comparator_Lambda_Main {
	public static void main(String[] args) {
		
		ArrayList<Comparator_Lambda> al = new ArrayList<Comparator_Lambda>();
		al.add(new Comparator_Lambda(1, "Hi", 56.98));
		al.add(new Comparator_Lambda(2, "bye", 36.98));
		al.add(new Comparator_Lambda(4, "Hello", 96.98));
		al.add(new Comparator_Lambda(5, "Hiii", 46.98));
		al.add(new Comparator_Lambda(3, "Hyiee", 76.98));

		Comparator<Comparator_Lambda> c = (o1, o2) -> {
			return o1.id - o2.id;
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = sc.next();
		if (name.equalsIgnoreCase("name")) {
			c = (o1, o2) -> {
				return o1.name.compareTo(o2.name);
			};
		}
		if (name.equalsIgnoreCase("marks")) {
			c = (o1, o2) -> {
				if (o1.marks > o1.marks)
					return 1;
				if (o1.marks < o2.marks)
					return -1;
				return 0;
//				return (int) (o1.marks - o2.marks);
			};
		}
		Collections.sort(al, c);
		for (Comparator_Lambda com : al) {
			System.out.println(com);
		}

//		Comparator<Comparator_Lambda> c1 = (o1, o2) -> {
////			if (o1.marks > o2.marks)
////				return 1;
////			if (o1.marks < o2.marks)
////				return 1;
////			return 0;
//			return (int)(o1.marks-o2.marks);
//		};
//		Comparator<Comparator_Lambda> c2 = (o1, o2) -> {
//			return o1.name.compareTo(o2.name);
//		};
//		Collections.sort(com, c);
//		for (Comparator_Lambda com1 : com) {
//			System.out.println(com1);
//		}
//		System.out.println();
//		Collections.sort(com, c1);
//		for (Comparator_Lambda com2 : com) {
//			System.out.println(com2);
//		}
//		System.out.println();
//		Collections.sort(com, c2);
//		for (Comparator_Lambda com3 : com) {
//			System.out.println(com3);
//		}
	}
}
