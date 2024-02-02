package my_Work;

public class Arm {

	public static void main(String[] args) {
	int num = 153, temp = num, count = 0, sum = 0, prod = 1;

		while (num > 0) {
			count++;
			num /= 10;
		}
		int h = 1;
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
				continue;
			}

		}
		System.out.println(sum);

//		if(sum==temp)
//		{
//			System.out.println("Arm");
//		}
//		else
//		{
//			System.out.println("Not ARM");
//		}

	}
}
