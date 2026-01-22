package enumpack;

public enum Weekdays_1 {
	sunday(), monday(200), tuesday(12), wednesday(13), thursday(45), friday(56), saturday(136);

	int value1;
	int value2;

	Weekdays_1(int value) {
		this.value1 = value;
	}

	Weekdays_1() {

	}

	public int m1(int n) {
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
	}

	public void m2() {
		int a = 10, b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

	}

	public boolean m3(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				c++;
		}
		return c == 2;
	}
}
