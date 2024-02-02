package my_Work;

import java.util.Arrays;

public class Robber {
	public static void main(String[] args) {
		int a[] = { 2, 3, 2 };

		if (a.length % 2 == 1) {
			int k = 0;
			for (int i = 0; i < a.length - 1; i++) {
				if(a[i]>a[i+1]) {
					a[i+1]=a[i];
				}
			}
			System.out.println(Arrays.toString(a));
		} else {
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i + 1]);
			}
		}

	}
}
