package Interface;

public interface Sub {
abstract void m2();
default void m4() {
	System.out.println("From M4");
}
void m5();
}
