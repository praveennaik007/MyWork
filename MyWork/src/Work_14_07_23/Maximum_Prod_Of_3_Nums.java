package Work_14_07_23;

public class Maximum_Prod_Of_3_Nums {
	public static void main(String[] args) {
		int a[] = { 6, 3, 2, 0, 10 };
		int fmax = 0, smax = 0, tmax = 0;
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
		System.out.println(fmax * smax * tmax);
	}
}
