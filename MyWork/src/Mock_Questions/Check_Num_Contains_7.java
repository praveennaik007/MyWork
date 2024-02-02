package Mock_Questions;

public class Check_Num_Contains_7 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 60; i <= 80; i++) {
			if (Contain7(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);

	}

	private static boolean Contain7(int n) {
		while (n != 0) {
			int rem = n % 10;
			if (rem == 7) {
				return true;
			}
			n /= 10;
		}
		return false;
	}

}
