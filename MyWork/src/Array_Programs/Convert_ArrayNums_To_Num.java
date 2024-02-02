package Array_Programs;

public class Convert_ArrayNums_To_Num {
	public static void main(String[] args) {
		int a[] = { 1, 298, 3, 4, 5, 34, 65, 0 };
		String res = "";
		for (int i = 0; i < a.length; i++) {
			res = res + a[i];
		}
		System.out.println(res);
	}
}
