package Array_Programs;

import java.util.Arrays;

public class Binary_Search_Using_Methods {
	public static void main(String[] args) {
		int a[] = { 20, 10, 30, 50, 70, 40, 60 };
		int target = 60;
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		bubbleSort(a);
		System.out.println(binarySearch(a, target));
	}

	public static int binarySearch(int a[], int target) {
		int first = 0;
		int last = a.length - 1;
		while (first <= last) {
			int mid = (first + last) / 2;
			if (a[mid] == target) {
				return mid;
			} else if (a[mid] > target) {
				last = mid + 1;
			} else if (a[mid] < target) {
				first = mid + 1;
			}
		}
		return -1;
	}

	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
//		System.out.println(Arrays.toString(a));
//		return ;
	}
}
