package typeCasting_Of_Non_Primitive;

import java.util.Scanner;

public class User_Defined {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
	Vehicle v=new Bike();
	
	if(v instanceof Car) {
		Car c=(Car)v;
		System.out.println(c.i);
		System.out.println(c.j);
		c.move1();
	}
	else if(v instanceof Bike) {
		Bike b=(Bike)v;
		System.out.println(b.i);
		System.out.println(b.k);
		b.move();
	}
	
	
}

}
