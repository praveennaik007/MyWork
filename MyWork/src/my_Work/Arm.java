package my_Work;

public class Arm {

	public static void main(String[] args) {
	int num = 153, temp = num, count = 0, sum = 0, prod = 1;

		while (num > 0) {
			count++;
			num /= 10;
		}
		for (int i = 1; i <= count; i++) {
			prod *= temp % 10;
			if (temp == 0) {
				break;
			}
			if (i == count) {
				sum += prod;
				i = 0;
				prod = 1;
				temp = temp / 10;
			}

		}
		if(sum==temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not A Armstrong");
		}

	}
}
