package my_Work;

public class Each_col_Largest_Element {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		/*
		 * 123	789
		 * 456
		 * 789
		 */
		System.out.println("Each Col Largest Element");
		int l = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[j][i]>l) {
					l=a[j][i];
				}
			}
			System.out.println(""+l);
		}
		System.out.println("-----------------");
		/*
		 * 123	3
		 * 456	6
		 * 789	9
		 */
		System.out.println("Each Row Largest Element");
		int l1 = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]>l1) {
					l1=a[i][j];
				}
			}
			System.out.println(l1);
		}
	}
}
