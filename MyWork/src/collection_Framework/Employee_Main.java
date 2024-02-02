package collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee_Main {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1, "H", 100, "12-10-21"));
		al.add(new Employee(3, "A", 300, "02-02-22"));
		al.add(new Employee(4, "E", 200, "04-11-22"));
		al.add(new Employee(2, "M", 400, "21-08-22"));
		Collections.sort(al);
		String str = "aeiouAEIOU";
//		for (Employee emp : al) {
//			int m = Integer.parseInt(emp.date.substring(3, 5));
//			int y = Integer.parseInt(emp.date.substring(6));
//			if ((y == 22 && m < 8) || y < 22) {
//				System.out.println(emp);
//			}
//		}
		ArrayList<Employee> al1 = new ArrayList<Employee>();

		for (Employee emp : al) {
			String name = emp.name.charAt(0) + "";
			if (str.contains(name)) {
				al1.add(emp);
			}
		}
		System.out.println(al1);
	}
}
