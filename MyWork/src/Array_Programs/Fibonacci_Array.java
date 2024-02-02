package Array_Programs;

public class Fibonacci_Array {
	public static void main(String[] args) {
		int a[] = { 3, 10, 13, 15, 17 };
//		for (int i = 0; i < a.length; i++) {
//		int x=0,y=1,res=0;
//			for (int j = 1; j <= a[i]; j++) {
//				res = x + y;
//				x = y;
//				y = res;
//				if (n == a[i]) {
//					System.out.println(a[i]);
//				}
//			}
		int x = 0, y = 1, res = 0;
		for (int i = 0; i < a.length; i++) {
			while (res <= a[i]) {
				if (res == a[i]) {
					System.out.println(a[i]);
				}
				res = x + y;
				x = y;
				y = res;
			}
		}

	}

}
