package Rough;

import java.util.ArrayList;

public class Array_List_P1 {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int n = a.length;
//	for (int i = 0; i < n; i++) {
//		al.add(a[i]);
//		
//	}
//	for (int i = 0; i < al.size(); i++) {
//		System.out.println(al.get(i));
//	}
		System.out.println(solve(n, a));
	}

	public static ArrayList<Integer> solve(int n, int a[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			al.add(a[i]);
		}
		return al;
	}
}
