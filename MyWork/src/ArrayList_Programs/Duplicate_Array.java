package ArrayList_Programs;

import java.util.ArrayList;

public class Duplicate_Array {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1); a.add(2); a.add(3); a.add(5); a.add(3);
		System.out.println(a);
		int sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i);
		}
		System.out.println("Sum : " + sum);
		System.out.print("Product : ");
		int prod = 1;
		for (int i = 0; i < a.size(); i++) {
			prod *= a.get(i);
		}
		System.out.print("Prod : " + prod);
		System.out.println();
		System.out.print("Prime Number : ");

		for (int i = 0; i < a.size(); i++) {
			int count = 0;
			for (int j = 1; j <= a.get(i); j++) {
				if (a.get(i) % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(a.get(i) + " ");
			}
		}
		System.out.println();
		System.out.print("Remove Duplicates : ");
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.size(); j++) {
				if (a.get(i) == a.get(j) && i > j) {
					break;
				}
				if (a.get(i) == a.get(j)) {

					System.out.println(a.get(i) + " ");
					break;
				}
			}
		}
		System.out.println("Print Duplicates ");
		for (int i = 0; i < a.size() - 1; i++) {
			if (a.get(i) == a.get(i + 1)) {
				System.out.println(a.get(i));
			}
		}
	}

}
