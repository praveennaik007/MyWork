package final_Concept;

public class B extends A {
	@Override
	public void run() {
		System.out.println("Running");
	}

	public static void main(String[] args) {
		A obj = new B();
		obj.run();// Running
		obj.m1();// Hello
		obj.sleep();// Sleeping
	}

}
