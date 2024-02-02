package my_Work;

public class Third_Min_Array {
	public static void main(String[] args) {
		int a[] = { 50, 10, 10, 20, 30, 40, 50, 60 };
		int fmin = 0;
		int smin = 0;
		int tmin = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > fmin) {
				fmin = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < fmin) {
				tmin = smin;
				smin = fmin;
				fmin = a[i];
			} else if (a[i] < smin && a[i] != fmin) {
				tmin = smin;
				smin = a[i];
			} else if (a[i] < tmin && a[i] != smin && a[i] != fmin) {
				tmin = a[i];
			}
		}
		System.out.println("Third min " + tmin);
	}
}
