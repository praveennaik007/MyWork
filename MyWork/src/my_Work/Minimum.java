package my_Work;

import java.util.Scanner;

public class Minimum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(min(a));
	}
public static int min(int a[]) {
	int min = a[0];
	for (int i = 0; i < a.length; i++) {
		if (a[i] < min)

			min = a[i];
	}
return min;
}
}
