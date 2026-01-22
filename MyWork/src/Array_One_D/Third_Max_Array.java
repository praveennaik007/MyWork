 package Array_One_D;

public class Third_Max_Array {
	public static void main(String[] args) {
		int a[] = { 10, 20, 40, 30, 40, 40, 50, 60 };
		int fmax = 0;
		int smax = 0;
		int tmax = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > fmax) {
				tmax = smax;
				smax = fmax;
				fmax = a[i];
			} else if (a[i] > smax && a[i] != fmax) {
				tmax = smax;
				smax = a[i];
			} else if (a[i] > tmax && a[i] != fmax && a[i] != smax) {
				tmax = a[i];
			}
		}
		System.out.println(tmax);
	}
}
