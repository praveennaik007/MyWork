package switch_Case;

public class Print_Day_Is_Working_Day_Or_Not {
	public static void main(String[] args) {
		int day = 03;
		switch (day) {
		case 01:
			System.out.println("Sunday is Not A Working Day");
			break;
		case 02:
			System.out.println("Monday is A Working Day");
			break;
		case 03:
			System.out.println("Tuesday is A Working Day");
			break;
		case 04:
			System.out.println("Wednesday is A Working Day");
			break;
		case 05:
			System.out.println("Thursday is A Working Day");
			break;
		case 06:
			System.out.println("Friday is A Working Day");
			break;
		case 07:
			System.out.println("Saturday is Working Day");
			break;
		default:
			System.out.println("Not Matching...");
			break;
		}
	}
}
