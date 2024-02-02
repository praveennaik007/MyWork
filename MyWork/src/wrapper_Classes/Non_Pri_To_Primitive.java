package wrapper_Classes;

public class Non_Pri_To_Primitive {
	public static void main(String[] args) {
//		Converting Non_primitive to primitive normal way
		// Integer obj = new Integer(100);
		Integer obj = Integer.valueOf(100);
		int obj1 = obj.intValue();
		System.out.println(obj1);
		// Auto-Un_boxing
		int obj2 = obj;
//	Internally int obj1 = obj.intValue();	
		System.out.println(obj2);
		// Un_Boxing
		Character c3 = new Character('A');
		char ch1 = c3.charValue();
		System.out.println(ch1);
		// Auto-Un_Boxing
		char ch2 = c3;
//		Internally char ch1 = c3.charValue();
		System.out.println(ch2);
	}
}
