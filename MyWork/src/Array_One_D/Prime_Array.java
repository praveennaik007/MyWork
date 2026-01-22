package Array_One_D;

public class Prime_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
