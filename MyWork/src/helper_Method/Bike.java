package helper_Method;

// SINGLETON CLASS
//	it is used to create only one object(Instance) 
//	One class -> only one Object ->Global Access 
// Make constructor as private
// Create static object(Instance) variable
// Create public static method to access object global
// Advantage 1. Memory efficient 2. Easy Global Access 3. Better control over resources
/*
 * Interview : 
 * A Singleton class allows only one Instance of a class and provides global to it.
 */
public class Bike {
	private static Bike b;
	int c;

	private Bike(int c) {
		super();
		this.c = c;
	}

	public static Bike getBike() {
		if (b == null) {
			b = new Bike(100);
		}
		return b;
	}

}
