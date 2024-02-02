package ArrayList_Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Nth_Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int n = sc.nextInt();
		int k = 2;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			al.add(sc.nextInt());
		}
		int pm = Integer.MAX_VALUE;
		for (int c = 0; c < k; c++) {
			int cm = Integer.MIN_VALUE;
			for (int j = 0; j < al.size(); j++) {
				if (al.get(j) > cm && al.get(j) < pm) {
					cm = al.get(j);
				}
			}
			pm = cm;
		}
		System.out.println(pm);
	}
}
