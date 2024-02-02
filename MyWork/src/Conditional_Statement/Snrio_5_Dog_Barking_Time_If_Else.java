package Conditional_Statement;

public class Snrio_5_Dog_Barking_Time_If_Else {
	public static void main(String[] args) {
		boolean barks = false;
		int hrs = 2;
		if (barks && (hrs < 5 || hrs > 20)) {
			System.out.println("Danger ");
		} else {
			System.out.println("Safe ");
		}
	}
}
