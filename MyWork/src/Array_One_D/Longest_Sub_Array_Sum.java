package Array_One_D;

public class Longest_Sub_Array_Sum {
	public static void main(String[] args) {
		int a[] = { 7, 2, -4, 5, 8, 6, -2, -9 };
		int max = Integer.MIN_VALUE;
		int first = -1;
		int last = -1;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum = sum + a[j];
				if (sum > max) {
					max = sum;
//					System.out.println("max " + max);
					first = i;
//					System.out.println("first " + first);
					last = j;
//					System.out.println("last " + last);
				}
			}
		}
		System.out.println(max);
		for (int i = first; i <= last; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
