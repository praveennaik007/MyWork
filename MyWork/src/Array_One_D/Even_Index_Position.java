package Array_One_D;

public class Even_Index_Position {
	public static void main(String[] args) {
		int a[] = { 2, -3, 8, 6, -7, 18, 1 };
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(i%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
