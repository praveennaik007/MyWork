package Interface;

public interface Super {
	abstract void m1();
	default void m3() {
		System.out.println("From m3");
	}
}
