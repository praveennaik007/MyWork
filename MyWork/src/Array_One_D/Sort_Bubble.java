package Array_One_D;

public class Sort_Bubble {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size ");
//		int n = sc.nextInt();
//		int a[] = new int[n];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = sc.nextInt();// 3,2,1,4,5
//		}
		int a[] = { 2, 5, 3, 7, 8, 4 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
