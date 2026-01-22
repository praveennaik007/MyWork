package Array_One_D;

public class Longest_Increasing_SubArray {
	public static void main(String[] args) {
		int a[] = { 5, 7, 4, 6, 8, 9, 12, 15, 4, 3, 2, 1 };
		int c = 0, mc = 0, f = -1, l = -1, fi = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {
				c++;
			} else {
				fi = i + 1;
				c = 1;
			}
			if (c > mc) {
				mc = c;
				f = fi;
				l = i + 1;
			}
		}
		System.out.println(mc);
		for (int i = f; i <= l; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
