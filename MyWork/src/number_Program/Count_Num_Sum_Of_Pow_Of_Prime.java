package number_Program;

public class Count_Num_Sum_Of_Pow_Of_Prime {
	public static void main(String[] args) {
		int n = 345621;
		int temp = n;
		int count = 0;
		int sum = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		n = temp;
		while (n != 0) {
			int d = n % 10;
			int c = 0;
			int i;
			for (i = 2; i < d; i++) {
				if (d % i == 0) {
					c++;
				}
			}
			if (c == 0 && d != 1) {
				System.out.println(d);
				int pow = 1;
				for (int j = 1; j <= count; j++) {
					pow *= d;
				}
				sum += pow;
			}
			n /= 10;
		}
		System.out.println(sum);
	}
}
