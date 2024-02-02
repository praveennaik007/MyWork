package Array_Programs;

public class Min_Max_Nums_Array {
	public static void main(String[] args) {
		int a[] = { 3, 9, 50, 15, 99, 7, 98, 65 };
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
