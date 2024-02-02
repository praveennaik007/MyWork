package number_Program;

public class Xylem_Pholem {
	public static void main(String[] args) {
		int n = 1234;
		int first = 0, last = 0;
		int d = n % 10;
		first = first + d;
		n /= 10;
		while (n > 9) {
			int d1 = n % 10;
			last = last + d1;
			n /= 10;
		}
		first = first + n;
		if (first == last) {
			System.out.println("Xylem");
		} else {
			System.out.println("Pholem");
		}
	}
}
