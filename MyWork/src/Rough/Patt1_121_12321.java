package Rough;

public class Patt1_121_12321 {
	public static void main(String[] args) {
		int st = 1, sp = 4;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			int n = 1;
			for (int k = 1; k <= st; k++) {
				if (k <= st / 2 + 1) {
					System.out.print(k);
				} else {
					System.out.print(k - 2 * n++);
				}
			}
			System.out.println();
			st += 2;
			sp--;
		}
	}
}
