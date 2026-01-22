package my_Work;

public class Sort_Desending_2DArray {
	public static void main(String[] args) {
		int a[][] = { { 4, 2, 3 }, { 9, 5, 6 }, { 7, 1, 9 } };
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();

//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length - 1; j++) {
//				if (a[i][j] < a[i][j + 1]) {
//					
//					int temp = a[i][j];
//					a[i][j] = a[i][j + 1];
//					a[i][j + 1] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j]);
//			}
//			System.out.println();
//		}

		for (int i = 0; i < a.length; i++) {
			sort(a[i]);
		}
		display(a);
	}

	public static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static void display(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
