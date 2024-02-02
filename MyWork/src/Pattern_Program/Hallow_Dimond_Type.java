package Pattern_Program;

public class Hallow_Dimond_Type {
	public static void main(String[] args) {
		int n = 15, space = -1, mid = (n / 2) + 1, star = mid;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= star; j++) {
				if (j == 1 || j == star || i == 1 || i == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star; j++) {
				if (j != mid) {
					if (j == 1 || j == star || i == 1 || i == n)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
			}
			System.out.println();
			if (i <= n/2) {
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}
		}
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				if (i == 1 || i == 5 || j == 1 || j == 5) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
	}
}
