package Array_One_D;

public class Search_Linear {
	public static void main(String[] args) {
		int a[] = { 1, 5, 3, 2, 4 };
		int target = 4;
		boolean rs = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				rs = true;
			}
		}
		if (rs) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present ");
		}
	}
}
