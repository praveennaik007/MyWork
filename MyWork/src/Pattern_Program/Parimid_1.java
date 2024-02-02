package Pattern_Program;

public class Parimid_1 {
	public static void main(String[] args) {
		int star = 1, space = 4;
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			if (i <= 4) {
				star++;
				space--;
			} else {
				star--;
				space++;
			}
			System.out.println();
		}
	}
}
