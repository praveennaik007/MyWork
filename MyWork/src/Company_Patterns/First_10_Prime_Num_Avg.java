package Company_Patterns;

public class First_10_Prime_Num_Avg {
	public static void main(String[] args) {
		int n = 10;
		int count1 = 0;
		int sum = 0;int k=1;
		for (int i = 1; count1 <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				sum += i;
				System.out.println(k++ +" prime "+i);//Prints all N prime nums
				count1++;
			}
			if (count1 == n) {
				System.out.println("Nth Prime Number : "+i);//prints Nth prime number 
				break;
			}
		}
//		System.out.println("First 10 Prime Num Sum : " + sum);
//		int avg = sum / 10;
//		System.out.println("First 10 Prime Num Average : " + avg);

	}
}
