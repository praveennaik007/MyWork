package encapsulation;

public class Emp_User {
	public static void main(String[] args) {
		Emp obj = new Emp("gayathri", "Dev", 13000);
//		System.out.println(obj.getSal());
		obj.run1();
		obj.setSal(15000);
		System.out.println(obj.getSal());
		obj.run1();
	}
}
