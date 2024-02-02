package work_05_7_23;

public class Overriding_Child2 extends Overriding{
	@Override
	public void display() {
		System.out.println("hey...");
	}
	public static void main(String[] args) {
		Overriding o=new Overriding_Child2();
		o.display();
	}
}
