package Array_Programs;

public class Longest_Sub_Array_Sum {
	public static void main(String[] args) {
		int a[] = { 5, -3, 2, 5, -7, 5, 7, 9, -2, -6 };
		int max = a[0];
		int first = -1;
		int last = -1;
		for (int i = 0; i < a.length; i++) {
			int sum = a[i];
			for (int j = i + 1; j < a.length; j++) {
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
