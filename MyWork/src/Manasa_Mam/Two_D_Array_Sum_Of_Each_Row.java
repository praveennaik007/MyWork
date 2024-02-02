package Manasa_Mam;

import java.util.Scanner;

public class Two_D_Array_Sum_Of_Each_Row {
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter the " + i + "," + j);
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
			System.out.println("Each row sum is "+i+" "+sum);
		}
		
	}
}
