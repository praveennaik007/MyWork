package Array_One_D;

public class Second_Max_Array {
	public static void main(String[] args) {
		int a[] = { 99, 99, 25, 66, 21, 22, 25, 66 };
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
		System.out.println("Second max " + smax);

	}
}
