package my_Work;

public class Second_min_Array {
	public static void main(String[] args) {
		int a[] = { 10, 20, 20, 10, 30, 40, 50, 60 };
		int fmin = 0;
		int smin = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > fmin) {
				fmin = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < fmin) {
				smin = fmin;
				fmin = a[i];
			} else if (a[i] < smin && a[i] != fmin) {
				smin = a[i];
			}
		}
		System.out.println("Second min "+smin);
	}
}
