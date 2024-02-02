package static_Non_Static_Execution;

public class Static_Block_With_Methods {
public static void display() {
	System.out.println("Static start ");
}
static{
	System.out.println("Displaying Static method ");
	display();
}
static {
	System.out.println("Dispalying static Main Method");
	main(null);
	
}
public static void main(String[] args) {
	System.out.println("Actual Main Method ");
	display();
}
}
