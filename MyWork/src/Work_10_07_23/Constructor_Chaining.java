package Work_10_07_23;

public class Constructor_Chaining {

	public Constructor_Chaining() {
		
		System.out.println("hello...");
	}
public Constructor_Chaining(int id, String name) {
	this();
	System.out.println("Two Parameters ");
}
public Constructor_Chaining(int n) {
	this(1, "hi");
	System.out.println("One Parameter ");
}
public static void main(String[] args) {
	Constructor_Chaining c=new Constructor_Chaining();

}

}
