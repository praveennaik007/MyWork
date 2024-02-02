package Interface;

public class User_Main_I1_I2 implements I1, I2 {

	public void m1() {
		System.out.println("From m1() Method ");
	}

	public void m2() {
		System.out.println("From M2() Method ");
	}

	public static void main(String[] args) {
		I1 i = new User_Main_I1_I2();
		i.m1();
		I2 i1 = new User_Main_I1_I2();
		i1.m2();
	}

}
