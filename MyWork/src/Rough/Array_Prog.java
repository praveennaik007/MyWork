package Rough;

public class Array_Prog {
	public static void main(String[] args) {
		int n = 4;
		int x=0;
		// 0 0 0 1, 0 0 2 1, 0 3 2 1, 4 3 2 1
		int a[] = new int[n * n];
		for (int i = 0; i < n; i++) {
			int y=n;
			for (int j = 0; j < n; j++) {
				a[x++]=y;
				
				
			}
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
