package Company_Patterns;

import java.util.Scanner;

public class Tcs_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = scanner.nextInt();

		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the elements of index : " + i);
			a[i] = scanner.nextInt();
		}
		System.out.println("Enter the Targeted Sum Value : ");
		int target_sum = scanner.nextInt();
		
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the starting Index : ");
			int sI = scanner.nextInt();
			System.out.println("Enter the Ending index : ");
			int eI = scanner.nextInt();
			int sum = 0;
			for (int k = sI; k <= eI; k++) {
				sum += a[k];
			}
			if (sum == target_sum) {
				count++;
			}

		}
		System.out.println("Count : "+count);
	}
}
