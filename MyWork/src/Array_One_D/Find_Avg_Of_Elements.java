package Array_One_D;

/* Create an Array of integer type and 
 find the Average of those elements*/
public class Find_Avg_Of_Elements {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int k = a.length;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Sum is " + sum);
		int avg = sum / a.length;
		System.out.println("Avg is " + avg);
	}
}
