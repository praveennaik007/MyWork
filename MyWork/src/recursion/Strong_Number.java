package recursion;

public class Strong_Number {
	static int sum = 0;

	public static void main(String[] args) {
//		System.out.println(strong(145));
		int num=145;
		if(strong(num)==145) {
			System.out.println("Strong Number ");
		}else {
			System.out.println("Not A Strong Number ");
		}
	}

	public static int strong(int n) {
		if (n == 0) {
//			System.out.println(sum);
			return sum;
		} else {
			sum += fact(n%10);
			n /= 10;
			return strong(n);
		}
		
	}

	public static int fact(int n) {
		if (n == 1)
			return n;
		else
			return n * fact(n - 1);

	}
}
