package Pattern_Program;

public class Diamond_Patt_1_121_12321 {
	public static void main(String[] args) {
		int star = 1, space = 4;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			int x = 1;
			for (int j = 1; j <= star; j++) {
				System.out.print(x);
				if (j <= star / 2)
					x++;
				else
					x--;
			}
			if (i < 4) {
				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}
			System.out.println();
		}
	}
}
