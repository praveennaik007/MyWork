package number_Program;

public class Armstrong {
	public static void main(String[] args) {
		int num = 153, temp = num, count = 0, sum = 0, prod = 1,temp1=num;

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
			if(sum==temp1)
			{
				System.out.println("Armstrong");
			}
			else
			{
				System.out.println("Not A Armstrong");
			}

		}
}
