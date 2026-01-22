package Array_One_D;

public class Check_Repeated_Element_Present_Or_Not {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 1 };
		boolean rs = false;
		int i = 0;
		for (i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					rs = true;
				}
			}
		}
		if (rs) {
			System.out.println("Repeated Elements Are Present  ");
		} else {
			System.out.println("No Repeated Elements Present ");
		}
	}
}
