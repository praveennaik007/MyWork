package Array_Programs;

public class Missing_Element {
	public static void main(String[] args) {
		int a[] = { 0, 1, 4, 5, 6 };
		missing(a);
	}

	public static void missing(int[] n) {
		int i = 0;
		int ele = n[i];
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
