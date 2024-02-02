package number_Program;

public class Prime_Number_Other_way {
	public static void main(String[] args) {
		int n = 7;
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Prime number ");
		} else {
			System.out.println("Not prime number ");
		}
	}
}
