package Work_10_07_23;

public class Array {
	public static void main(String[] args) {
		int a[] = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
		int n = a.length;
		int max = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int i2=-1,j2=-1;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i] <= a[j]) {
					k = j - i;
					if (k > max) {
						max = k;
						i2=i;
						j2=j;
					}
				}
			}
		}
		System.out.println(max);
		System.out.println(i2+","+j2);

	}
}
