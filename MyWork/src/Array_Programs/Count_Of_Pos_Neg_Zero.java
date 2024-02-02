package Array_Programs;

public class Count_Of_Pos_Neg_Zero {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 0, 4, 0, 5, -1, 7, -4, 0 };
		int pos = 0;
		int neg = 0;
		int zero = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				zero++;
			}
			if (a[i] > 0) {
				pos++;
			}
			if (a[i] < 0) {
				neg++;
			}
		}
		System.out.println("Zero Count = " + zero + " Pos count = " + pos + " neg count = " + neg);
	}
}
