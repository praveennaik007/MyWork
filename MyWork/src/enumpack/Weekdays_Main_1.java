package enumpack;

public class Weekdays_Main_1 {
	public static void main(String[] args) {
		System.out.println(Weekdays_1.saturday.m1(123));
		System.out.println("==========********==========");
		Weekdays_1.monday.m2();
		System.out.println("==========********==========");
		if (Weekdays_1.thursday.m3(7) == true)
			System.out.println("Prime Number ");
		else
			System.out.println("Not Prime Number");

	}
}
