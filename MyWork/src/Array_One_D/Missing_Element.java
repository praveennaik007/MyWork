package Array_One_D;

public class Missing_Element {
	public static void main(String[] args) {
		int a[] = { 0, 1, 4, 5, 6, 9,11 };
		missing(a);
	}

	public static void missing(int[] n) {
		int i = 0;
		int ele = 0;
		while (i < n.length) {
			if (n[i] != ele) {
				System.out.print(ele + " ");
			} else {
				i++;
			}
			ele++;
		}
	}
}
