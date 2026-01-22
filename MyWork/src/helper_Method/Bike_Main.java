package helper_Method;

public class Bike_Main {
	public static void main(String[] args) {
		Bike b = Bike.getBike();
		Bike b1 = Bike.getBike();
		System.out.println(b);// helper_Method.Bike@48cf768c
		System.out.println(b1);// helper_Method.Bike@48cf768c
		System.out.println(b.c);// 100

	}
}
