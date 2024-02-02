package work_06_07_23;

public class Print_Duplicate_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 1, 2, 3, 3, 2, 1, 4,-1,-1 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = -10;
				}
			}
			if (a[i] != -10 && count >= 1) {
				System.out.println(a[i]);
			}
		}
	}
}
