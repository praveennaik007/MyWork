package typeCasting_Of_Non_Primitive;

public class User {
	public static void main(String[] args) {
		Vehicle obj = new Car();
//		Car obj2 = (Car) obj;
//		System.out.println(obj2.i);
//		System.out.println(obj2.j);
//		obj2.move1();
////		System.out.println("*************");
//	Vehicle obj3=new Bike();
//	Bike obj1=(Bike)obj;
//	System.out.println(obj.i);
//	obj1.move();
	
		System.out.println("*************");
	if(obj instanceof Car) {
		((Car)obj).move1();
		System.out.println(((Car)obj).j);
	}else {
		((Bike)obj).move();
		System.out.println(((Bike)obj).k);
	}
	}
}
