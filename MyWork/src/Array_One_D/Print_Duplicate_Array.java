  package Array_One_D;

public class Print_Duplicate_Array {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 1, 2, 3, 3, 2, 1, 4,-1,-1 };
		int b[]=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					b[j] = 1;
				}
			}
			if (b[i] != 1 && count >= 1) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
