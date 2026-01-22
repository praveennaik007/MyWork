package Array_One_D;

public class Sort_Merge {
	public static void main(String[] args) {
		int a[]= {1,5,3,7,9,12};
		int b[]= {43,23,4,76,87,34};
		System.out.println(mergeSort(a, b));
	}

	public static int[] mergeSort(int arr1[], int arr2[]) {
		int c[] = new int[arr1.length + arr2.length];

		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				c[k] = arr1[i];
				i++;
			} else {
				c[k] = arr2[j];
				j++;
			}
			k++;
		}
		while (i < arr1.length) {
			c[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			c[k] = arr2[j];
			j++;
			k++;
		}
		return c;
	}
}
