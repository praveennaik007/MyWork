package Array_One_D;

public class Longest_Increasing_SubArray_AnotherWay {
	public static void main(String[] args) {
		int max = 0, temp = 0, start = 0, end = 0, c = 0;
		int a[] = { 5, 7, 4, 6, 8, 9, 12, 15, 4, 3, 2, 1 };
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
				c++;
				if (max < c) {
					max = c;
					start = temp;
					end = i;
				}
			} else {
				c = 0;
				temp = i;
			}
		}
		for (int i = start; i <= end; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("===> "+max);
	}
}
