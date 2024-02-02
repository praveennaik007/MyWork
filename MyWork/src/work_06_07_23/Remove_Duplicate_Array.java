package work_06_07_23;

public class Remove_Duplicate_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 2, 3, 4, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = -1;
				}
			}
			if (a[i] != -1) {
				System.out.println(a[i]);
			}
		}
	}
}
