package Array_One_D;

public class Prime_Number_Array {
	public static void main(String[] args) {

		int a[] = { 2, 3, 5, 6, 4, 7 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Prime number " + a[i]);
			}
		}

	}
}
