package Array_One_D;

public class All_Even_First_Odd_Next {
	public static void main(String[] args) {
		int a[] = { 10, 98, 3, 33, 12, 21, 11 };
		int b[] = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				b[j++] = a[i];
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0)
				b[j++] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
}
//for (int i = 0; i < a.length-1; i++) {
//System.out.println(b[i]);
//}
//System.out.println(b[b.length-1]);