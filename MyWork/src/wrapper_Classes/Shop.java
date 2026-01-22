// Non-Primitive Returning
package wrapper_Classes;

public class Shop {
	Product Shell() {
		Product p = new Product();
		return p;
	}

	public static void main(String[] args) {
		Shop s = new Shop();
		Product x = s.Shell();
		System.out.println(x);
	}

}
