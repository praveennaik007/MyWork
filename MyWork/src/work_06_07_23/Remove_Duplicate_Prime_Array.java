package work_06_07_23;

public class Remove_Duplicate_Prime_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 1, 2, 3, 5, 3, 7, 2, 3, 5, 13, 13, 19 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = -1;
				}
			}
//			if(a[i]!=-1) {
//				System.out.println(a[i]);
//			}
		}
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(a[i]);
			}
		}
	}
}
