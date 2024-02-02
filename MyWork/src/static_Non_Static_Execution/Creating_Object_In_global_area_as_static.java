package static_Non_Static_Execution;

public class Creating_Object_In_global_area_as_static {
	static int i = 10;
	int j = 20;
	  Creating_Object_In_global_area_as_static c = new Creating_Object_In_global_area_as_static();

	public static void main(String[] args) {
		Creating_Object_In_global_area_as_static cm = new Creating_Object_In_global_area_as_static();
//		System.out.println(c.cm.i);
//		System.out.println(cm.cm.cm.cm.j);
		System.out.println(cm.j);
		System.out.println(cm.i);
	}
}
