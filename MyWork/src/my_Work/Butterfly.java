package my_Work;

public class Butterfly {

	public static void main(String[] args) {
		int n = 5;
		for (int i = (-n) + 1; i < n; i++) {
			int a = i;
			if (a < 0)
				a = -a;
			for (int j = (-n) + 1; j < n; j++) {
				int b = j;
				if (b < 0)
					b = -b;
				if (a <= b) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}