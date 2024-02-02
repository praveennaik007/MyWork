package imp_Work;


public class Static_Block_Execution {
	public static void add() {
		System.out.println("Enjoy...");
	}
	static {
		add();
	}
	static {
		main(null);
	}
	
public static void main(String[] args) {
	System.out.println("Ms");
	System.out.println("Me");
}
static {
	System.out.println("hello");
}
}
