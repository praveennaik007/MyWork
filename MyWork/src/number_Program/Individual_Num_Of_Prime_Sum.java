package number_Program;

public class Individual_Num_Of_Prime_Sum {
	public static void main(String[] args) {
		int num = 564236;
		int sum = 0;
		while (num > 0) {
			int d = num % 10;
			int i = 2;
			int count = 0;
			for (; i < d; i++) {
				if (d % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				sum = sum + i;
			}
			num /= 10;
		}
		System.out.println(sum);
	}
}
