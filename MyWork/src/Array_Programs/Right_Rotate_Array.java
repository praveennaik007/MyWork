package Array_Programs;

import java.util.Arrays;

public class Right_Rotate_Array {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int r=3;
		for (int i = 0; i <=r; i++) {
			int ele=a[a.length-1];
			for (int j = a.length-2; j >=0; j--) {
				a[j+1]=a[j];
			}
		a[0]=ele;
		}
		System.out.println(Arrays.toString(a));
	}
}
