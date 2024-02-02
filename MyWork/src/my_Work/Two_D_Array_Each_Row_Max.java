package my_Work;

import java.util.Scanner;

public class Two_D_Array_Each_Row_Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = { { 1, 2, 13 }, { 4, 5, 6 }, { 7, 8, 9 } };
//	System.out.println("Zagged Array ");
//	int a[][]=new int [4][];
//	for (int i = 0; i < a.length; i++) {
//		System.out.println("Enter the no of cols in the row "+i);
//		int j=sc.nextInt();
//		a[i]=new int [j];
//		for (int j1 = 0; j1 < a[i].length; j1++) {
//			System.out.println("Enter the value "+i+","+j);
//			a[i][j1]=sc.nextInt();
//		}
//		System.out.println("Normal Way Array ");
//	int a[][]=new int[3][3];
//	for (int i = 0; i < a.length; i++) {
//		for (int j = 0; j < a[i].length; j++) {
//			System.out.println("Enter the "+i+","+j);
//			a[i][j]=sc.nextInt();
//		}
//	}
		for (int i = 0; i < a.length; i++) {
			System.out.println("row "+i +" "+rowMax(a,i));
		}
		
	}

	public static int rowMax(int a[][], int i) {
		int k = 0;
//		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (k < a[i][j]) {
					k = a[i][j];
				}
			}
		//}
		return k;
	}
}
