package my_Work;

import java.util.*;

public class Remove_Prime_Elements_Using_Iterator {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(5);
		al.add(4);
		al.add(7);
		al.add(3);
		al.add(8);
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer a = itr.next();
			if (prime(a) == true) {
				itr.remove();
			}
		}
		System.out.println(al);
	}

	public static boolean prime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		return c == 2;
	}
}
