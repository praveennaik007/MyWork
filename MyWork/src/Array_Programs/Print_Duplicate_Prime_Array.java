package Array_Programs;

public class Print_Duplicate_Prime_Array {
	public static void main(String[] args) {
		int a[] = { 5, 4, 3, 2, 1, 5, 6, 7, 3, 3, 2, 5 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
//				System.out.print(a[i]);
			}
		}
		for (int i = 0; i < a.length; i++) {
			int c = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					c++;
					a[j] = -1;
				}
			}
			if (a[i] != -1) {
				if (c >= 1) {
					System.out.print(a[i]);
				}
			}
		}
	}
}
