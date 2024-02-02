package Array_Programs;

public class Second_Max_Array {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int fmax = 0;
		int smax = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > fmax) {
				smax = fmax;
				fmax = a[i];
			} else if (a[i] > smax && fmax != a[i]) {
				smax = a[i];
			}
		}
		System.out.println("Second max "+smax);

	}
}
