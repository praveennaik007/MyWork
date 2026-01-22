package LambdaExpMethodReference;

public class TestMain {
	public static void display() {
		System.out.println("Hello ");
	}

	public static void main(String[] args) {
		Test t = TestMain::display;
		t.test();// Hello

	}
}
