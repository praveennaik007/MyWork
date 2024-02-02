package number_Program;

public class Desarium {
	public static void main(String[] args) {
		int num = 135, count = 0, temp = num, n1 = num;
		while (num != 0) {
			num /= 10;
			count++;
		}
		int sum = 0;

		while (temp != 0) {
			int c = count;
			int pow = 1;
			int d = temp % 10;
			while (c != 0) {
				pow *= d;
				c--;
			}
			count--;
			sum += pow;
			temp /= 10;
		}
		System.out.println(sum);
		if (sum == n1) {
			System.out.println("Disarium");
		} else {
			System.out.println("Not Disarium");
		}
	}

}
