package Array_One_D;

public class Find_Duplicate_Fibonacci_Array {
	public static void main(String[] args) {
		int a[] = { 13, 2, 4, 3, 5, 4, 8, 5, 13 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count >= 1) {
				int x = 0, y = 1, res;
				for (int j = 0; j <= a.length; j++) {
					res = x + y;
					x = y;
					y = res;
					if (a[i] == res) {
						System.out.println(res);
					}
				}
			}

		}
	}		
}
