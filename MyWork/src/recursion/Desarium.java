package recursion;

public class Desarium {
	static int sum = 0, count1 = 0, count = 1, c;

	public static void main(String[] args) {
		String s="";
	
		int n = 135;
		c = count1(n);
		if (armStrong(n) == 135) {
			System.out.println("Desarium Number ");
		} else {
			System.out.println("Not Desarium Number ");
		}
	}

	public static int armStrong(int n) {
		if (n == 0) {
			System.out.println(sum);
			return sum;
		} else {

			int d = n % 10;
			sum += pow(d, c--);
			return armStrong(n / 10);
		}
	}

	public static int pow(int base, int pow) {
		if (pow == 1) {
			return base;
		} else {
			return base * pow(base, pow - 1);
		}
	}

//	public static int count(int n) {
//		if (n <= 9) {
//			return count;
//		} else {
//			count++;
//			return count(n / 10);
//		}
//	}

	public static int count1(int n) {
		if (n > 0) {
			count1++;
			count1(n / 10);
		}
		return count1;
	}
}
