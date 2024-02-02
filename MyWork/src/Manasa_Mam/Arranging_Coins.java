package Manasa_Mam;

public class Arranging_Coins {
	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		for (i = 1; i <= n; i++) {
			n = n - i;
		}
		System.out.println(i-1);
	}

}
