package Array_Programs;

public class Remove_Duplicates_Another_Way {
	public static void main(String[] args) {
		int a[] = { 1, 5, 1, 6, 8, 1 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j] && i > j) {
					break;
				}
				if (a[i] == a[j]) {
					count++;
					System.out.print(a[i]+" ");
					break;
				}
			}
		}
		System.out.println("count : " + count);
	}
}
