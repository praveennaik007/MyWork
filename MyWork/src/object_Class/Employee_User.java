package object_Class;

public class Employee_User {
	public static void main(String[] args) {
//		System.out.println("Before Overriding hashCode()");
//		Employee e = new Employee(101, "Raj", 45000);
//		System.out.println(e.hashCode());// 2036368507
//		Employee e1 = new Employee(101, "Raj", 45000);
//		System.out.println(e1.hashCode());// 1785210046

		System.out.println("After Overriding hashCode()");
//		Employee e = new Employee(101, "Raj");
//		System.out.println(e.hashCode());// 82016
		Employee e = new Employee(101, "Raj");
		System.out.println(e.hashCode());// 86007

//		Employee e1 = new Employee(102, "Raj", 45000);
//		System.out.println(e1.hashCode());// 1091479529
//		System.out.println("Before Overriding equals(Object o)");
//		System.out.println(e.equals(e1));// false

		System.out.println("After Overriding equals(Object o)");
//		System.out.println(e.equals(e1));

	}
}
