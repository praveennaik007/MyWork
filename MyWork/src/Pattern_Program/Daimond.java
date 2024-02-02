package Pattern_Program;

public class Daimond {
	public static void main(String[] args) {
		int star = -1, space = 5;char ch='A';
//		int star = 1, space = 4;
		for (int i = 1; i <= 7; i++) {
			if (i <= 4) {
				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(ch++);
//				System.out.print(i);
//				System.out.print(j);
//				System.out.print(i%2);
//				System.out.print(j%2);
			}
//			if (i <= 4) {
//				star += 2;
//				space--;
//			} else {
//				star -= 2;
//				space++;
//			}
			System.out.println();
		}
	}
}
